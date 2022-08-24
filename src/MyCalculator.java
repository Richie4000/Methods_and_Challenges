import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num1;
        int num2;

        // user enters first number
        System.out.println("Enter the first number: ");
        num1 = reader.nextInt();

        // user enters second number
        System.out.println("Enter the second number: ");
        num2 = reader.nextInt();

        // multiplication
        int multiply = num1 * num2;
        System.out.println("When you multiply those numbers you get: " + multiply);

        // addition
        int addition = num1 + num2;
        System.out.println("When you add those numbers you get: " + addition);

        // subtraction
        int subtraction = num1 - num2;
        System.out.println("When you subtract those numbers you get: " + subtraction);

        // division
        float division = num1 / num2;
        System.out.println("When you divide those numbers you get: " + division);
    }
}
