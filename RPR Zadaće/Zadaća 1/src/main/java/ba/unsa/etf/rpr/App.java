package ba.unsa.etf.rpr;

import static ba.unsa.etf.rpr.ExpressionEvaluator.*;

/**
 * Entry point to our Dijkstra's Algorithm program
 * @author Hana Mahmutović
 */
public class App 
{
    /**
     * Main method of our App
     * @param args array of strings in format ( a + ( b - ( c * ( d / ( sqrt e ) ) ) ) )
     */
    public static void main(String[] args){
        StringBuilder input = new StringBuilder();
        for(String s : args) {
            checkOperator(s);
            input.append(s).append(" ");
        }
        double result = evaluate(String.valueOf(input));
        System.out.println("The result using Dijkstra's Algorithm for expression evaluation is " + result);
    }
}
