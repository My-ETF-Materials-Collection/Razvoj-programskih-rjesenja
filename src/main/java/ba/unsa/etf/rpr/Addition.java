package ba.unsa.etf.rpr;

import java.util.Scanner;

/**
 * Class that accepts two inputs from keyboard and calculate their sum
 * @author Hana Mahmutovic
 * @version 1.0
 * */
public class Addition {

    /**
     * entry method for console application for addition
     * @param args input arguments from console
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter second number: ");
        int second = scanner.nextInt();

        System.out.println("Sum of the numbers is : "+ (first + second));
    }
}