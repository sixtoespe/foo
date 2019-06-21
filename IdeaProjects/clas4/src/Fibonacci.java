import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many number would you like include in the sequence:");
        int n = keyboard.nextInt();
        int num1 = 0, num2 = 1;

        int i = 0;
        while (i < n) {
            System.out.println(num1);
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            i++;
        }


    }
}