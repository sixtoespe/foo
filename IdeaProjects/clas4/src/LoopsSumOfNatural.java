import java.util.Scanner;

public class LoopsSumOfNatural {


    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an integer n:");
        int n = keyboard.nextInt();
        int addition = 0;

        for (int num = 1; num <= n; num++) {
            addition += num;
            System.out.println(addition);
        }


    }
}