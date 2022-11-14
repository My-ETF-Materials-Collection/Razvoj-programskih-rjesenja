package ba.unsa.etf.rpr;

import java.util.Stack;

import static java.lang.Double.parseDouble;

/**
 * ExpressionEvaluator class that uses two Stacks to calculate
 * expression in format like ( a + ( b - ( c * ( d / ( sqrt e ) ) ) ) )
 * where a, b, c, d, e are real numbers
 * @author Hana Mahmutović
 * @version 1
 */
public class ExpressionEvaluator {

    private static final Stack<String> operators = new Stack<>();

    private static final Stack<Double> operands = new Stack<>();

    /**
     * evaluate method that receives a string and calculates its value using Dijkstra's Algorithm
     */
    public static double evaluate(String s){
        String[] arrOfStr = s.split(" ");
        for(String x : arrOfStr){
            operatorChecker(x);
            switch (x) {
                case "(": break;
                case "+":
                case "-":
                case "x":
                case "sqrt":
                case "/":
                    operators.push(x); break;
                case ")":
                    String operator = operators.pop();
                    double operand = operands.pop();
                    switch (operator) {
                        case "+": operand = operands.pop() + operand; break;
                        case "-": operand = operands.pop() - operand; break;
                        case "x": operand = operands.pop() * operand; break;
                        case "/": operand = operands.pop() / operand; break;
                        case "sqrt": operand = Math.sqrt(operand); break;
                    }
                    operands.push(operand); break;
                default: operands.push(parseDouble(x)); break;
            }
        }
        return operands.pop();
    }

    /**
     * Checks if the given string is a valid and pre-defined operator or a real number, throws exception if it isn't
     */
    static void operatorChecker(String x) {
        if(!x.equals("(") && !x.equals("+") && !x.equals("-") && !x.equals("sqrt") && !x.equals("x") && !x.equals("/") && !x.equals(")") && !isNumeric(x)) throw new RuntimeException(errorMessage);
    }

    /**
     * checks if String is a real number (double)
     * @param string string that is being checked
     * @return true if string is a real number and false if it isn't
     */
    public static boolean isNumeric(String string) {
        double intValue;
        if (string == null || string.equals("")) return false;
        try {
            intValue = Double.parseDouble(string);
            return true;
        }catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * main error message that ends in output stream if input is not as expected
     */
    public static String errorMessage = "Unsupported format! " +
            "\nNOTE: Please use this reference: ( a + ( b - ( c * ( d / ( sqrt e ) ) ) ) )" +
            "\na, b, c, d, e - real number values" +
            "\nThe order of operators You use in expression is not important but note that n-operators need n-bracket pairs";

}