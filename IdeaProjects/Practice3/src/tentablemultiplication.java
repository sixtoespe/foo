//import java.util.Scanner;

public class tentablemultiplication {
    public static void main(String[] args) {

//        Scanner keyboard = new Scanner(System.in);
//        System.out.print("Enter an integer n:");
//        int n = keyboard.nextInt();
        int table = 10;


        for (int num = 0; num <= 10; num++) {
        String multip = (num + "*" + table + "=" +num * table);
            System.out.println(multip);


        }


    }
}
