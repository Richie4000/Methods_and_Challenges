import java.util.Scanner;

public class MinMaxMethods {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int min = 0;
        int max = 0;

        int num1;
        int num2;
        int num3;

        System.out.println("Enter your first number");
        num1 = reader.nextInt();

        System.out.println("Enter your second number");
        num2 = reader.nextInt();

        System.out.println("Enter your third number");
        num3 = reader.nextInt();

        // Maximum
        if (num1 > max)
            max = num1;
        if (num2 > max)
            max = num2;
        if (num3 > max)
            max = num3;

        System.out.println("The maximum value is: " + max);

        // Minimum value
        if (num1 < min)
            min = num1;
        if (num2 < min)
            min = num2;
        if (num3 < min)
            min = num3;

        // I keep getting minimum as 0 ?
        System.out.println("The minimum value is: " + min);




    }
}
