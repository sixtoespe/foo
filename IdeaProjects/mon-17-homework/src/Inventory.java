import java.util.Scanner;

public class Inventory {
            public static void main(String[] args) {

                System.out.println("Please enter the type of product received: ");
                Scanner go = new Scanner(System.in);
                String producttype = go.next();
                System.out.println("You entered: ");
                System.out.println("Please enter the cost to us for each: " + producttype);
                int cost = go.nextInt();
                System.out.print("Please enter the Brand Name: ");
                String brandname = go.next();
                System.out.print("Please enter the Number of" +producttype+ " in shiptment");
                int Numberinshiptment = go.nextInt();
                int totalcost = cost * Numberinshiptment;
                System.out.println("Shipment Summary: ");
                System.out.println("the new product is:" +producttype);
                System.out.println("This shipment included: " + Numberinshiptment + " from " + brandname);
                System.out.println("The total value of the shipment was $: " +totalcost);
                System.out.println("GST: " + totalcost * 1.05f);





            }
}
