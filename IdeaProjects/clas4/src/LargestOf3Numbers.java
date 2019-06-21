import java.util.Scanner;

public class LargestOf3Numbers {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Type three numbers:");
        int num1 = keyboard.nextInt();
        int num2 = keyboard.nextInt();
        int num3 = keyboard.nextInt();


        if ((num2 > num1) && (num2 > num3)) {
            System.out.println("The largest number is: " + num2);
        }

             else if ((num1 > num2) && (num1 > num3)) {
                System.out.println("The largest number is: " + num1);
             }

             else if ((num3 > num2) && (num3 > num1)) {
                    System.out.println("The largest number is: " + num3);
             }


            else{
                        System.out.println("Error: three number should be different, please try again");
                    }
                }

            }



