import java.util.Scanner;

public class FibonacciCalc {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int num;
        double sum = 0;

        int n1 = 0;
        int n2 = 1;

        System.out.println("Enter any number of your choice");
        num = reader.nextInt();
        if (num == 0)
            System.out.println("Please enter a number greater than 0");

        for (int i = 0; i < sum; i++) {
            System.out.println(sum + " ");
            n1 = n2;
            sum = n1 + n2;

        }
    }
}
