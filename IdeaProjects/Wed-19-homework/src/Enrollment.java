import java.util.Scanner;

public class Enrollment {
    public static void main(String[]args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Full name: ");
        String Name = inp.nextLine();
        System.out.print("Id: ");
        String ID = inp.nextLine();
        System.out.print("Course: ");
        String course = inp.nextLine();
        System.out.print("Grade CAL1: ");
        double CAL1 = inp.nextDouble();
        System.out.print("Grade CAL2: ");
        double CAL2 = inp.nextDouble();
        System.out.print("Grade CAL3: ");
        double CAL3 = inp.nextDouble();
        System.out.print("Grade CAL4: ");
        double CAL4 = inp.nextDouble();
        System.out.print("Grade CAL5: ");
        double CAL5 = inp.nextDouble();
        String MAT = Name + " " + ID + " " + course;
        System.out.println(" ");
        System.out.println(MAT);
        System.out.println(" ");
        double Average =(CAL1 + CAL2 + CAL3 + CAL4 + CAL5)/5;

        if ( Average>= 6) {
            System.out.println("approved " +Average);
        } else {
            System.out.println("not approved " +Average);

        }
    }

}

