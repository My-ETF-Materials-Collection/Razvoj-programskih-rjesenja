package ba.unsa.etf.rpr;

import java.util.Stack;
import static java.lang.Double.parseDouble;

/**
 * class that uses two stacks to calculate the expression
 * of format ( a + ( b - ( c * ( d / ( sqrt e ) ) ) ) )
 * where a, b, c, d, e are real numbers
 * @author Hana Mahmutović
 * @version 2
 */
public class ExpressionEvaluator {

    private static final Stack<String> operators = new Stack<>();
    private static final Stack<Double> operands = new Stack<>();

    /**
     * method that calculates the value of a string (ONLY VALID MATH EXPRESSIONS) using Dijkstra's Algorithm
     * @param s string
     * @return double
     */
    public static double evaluate(String s){
        String[] arrayOfStrings = s.split(" ");
        /* NOTE : need to check if there is more operations than brackets e.g. ( 1 + 8 / 2 )
         * stack would take the last operation and evaluate it, but it needs to throw an exception in this case
         * */
        int noOpeningBrackets = 0, noClosingBrackets = 0;
        for (String x : arrayOfStrings) {
            checkOperator(x);
            switch (x) {
                case "(":
                    noOpeningBrackets++; break;
                case "+": case "-": case "x": case "sqrt": case "/": case "*":
                    operators.push(x); break;
                case ")":
                    noClosingBrackets++;
                    if(operators.isEmpty()) continue;
                    String operator = operators.pop();
                    double operand = operands.pop();
                    switch (operator) {
                        case "+": operand = operands.pop() + operand; break;
                        case "-": operand = operands.pop() - operand; break;
                        case "x": case "*": operand = operands.pop() * operand; break;
                        case "/":
                            if (operand == 0) throw new RuntimeException("Division by 0 is undefined!");
                            operand = operands.pop() / operand; break;
                        case "sqrt":
                            operand = Math.sqrt(operand); break;
                    }
                    operands.push(operand); break;
                default:
                    operands.push(parseDouble(x)); break;
            }
        }
        if(operators.size()>0 || operands.size()!=1 || noOpeningBrackets!=noClosingBrackets) throw new RuntimeException("Invalid input! Not enough brackets.");
        return operands.pop();
    }

    /**
     * checks if the given string is a valid operator or a real number, if not throws an exception
     */
    static void checkOperator(String x) {
        if(!x.equals("(") && !x.equals("+") && !x.equals("-") && !x.equals("sqrt") && !x.equals("*") && !x.equals("x") && !x.equals("/") && !x.equals(")") && !isRealNumber(x)) throw new RuntimeException(errorMessage);
    }

    /**
     * checks if a String is a real number (double)
     * @param s string
     * @return true if string is a real number and false if it isn't
     */
    public static boolean isRealNumber(String s) {
        double intValue;
        if (s == null || s.equals("")) return false;
        try {
            intValue = Double.parseDouble(s);
            return true;
        }catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * main error message that ends in output stream if input is not as expected
     */
    public static String errorMessage = "Invalid input! NOTE : Every operator needs its pair of brackets.";

}