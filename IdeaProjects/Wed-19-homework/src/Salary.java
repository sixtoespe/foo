import java.util.Scanner;

public class Salary {
    public static void main(String[]args){

        Scanner sal= new Scanner(System.in);
        System.out.print("Salary:");
        float salary = sal.nextInt();
        float increase1 = salary*1.15f;
        float increase2 = salary*1.12f;

        if (salary < 1000) {
            System.out.println("The increase for this salary is 15% and the new salary will be: CAD$" +increase1);
        }
        else {
            System.out.println("The increase for this salary is 15% and the new salary will be: CAD$" +increase2);
        }
    }
}
