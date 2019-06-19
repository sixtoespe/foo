import java.util.Scanner;

public class PosNeg {
    public static void main(String[]args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Type a numbers:");
        int B = key.nextInt();

        if (B < 0) {
            System.out.println(+B+ " is negative");
        } else if (B > 0) {
            System.out.println(+B+ " is positive");
        } else {
            System.out.println("Error: the number should not be Cero");
        }
    }

}
