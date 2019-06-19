import java.util.Scanner;
public class Currency {
    private static double convert(double amount)
    {
       return amount;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount CAD$: ");
        double amount = input.nextDouble();
        System.out.print("USD$");
        System.out.print(convert(+amount * 0.75));
        input.close();
    }
}


