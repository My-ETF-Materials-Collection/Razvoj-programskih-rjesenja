package ba.unsa.etf.rpr.t2.z3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = new ArrayList<Double>();

        while(true){
            System.out.print("Enter a number or the word stop: ");
            String line = scanner.nextLine();
            if ("stop".equalsIgnoreCase(line.trim())){
                break;
            }
            try{
                Double number = Double.parseDouble(line);
                numbers.add(number);
            }catch (Exception e){
                System.out.println("The string entered is not a number!");
            }
        }

        System.out.println("Results: ");
        System.out.println("MIN: " + MathUtils.min(numbers));
        System.out.println("MAX: " + MathUtils.max(numbers));
        System.out.println("MEAN: " + MathUtils.mean(numbers));
        System.out.println("Standard deviation: " + MathUtils.standardDeviation(numbers));
    }
}