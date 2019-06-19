import java.util.Scanner;

public class practice2 {

    public static void main(String[]args){

        Scanner keyboard= new Scanner(System.in);
        System.out.print("Type two numbers:");
        int num1= keyboard.nextInt();
        int num2= keyboard.nextInt();

        if (num1 < num2) {
            System.out.println("The largest number is: " +num2);
            System.out.println("The lowest number is: " +num1);}
            else if (num1 > num2){
            System.out.println("The largest number is: " +num1);
            System.out.println("The lowest number is: " +num2); }
            else {
            System.out.println("Error: both number should be different, please try again");
            }
    }
}
