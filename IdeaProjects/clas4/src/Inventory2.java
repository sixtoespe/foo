import java.text.DecimalFormat;
import java.util.Scanner;

public class Inventory2 {
    public static void main(String[] args) {
        Scanner go = new Scanner(System.in);
        DecimalFormat ft = new DecimalFormat("0.00");
        System.out.print("Your name please: ");
        String customerName = go.next();
        String brandname;
        int cost;
        int Numberinshiptment;
        int subtotalcost;
        String prodYN;

        do {

            System.out.print("Please enter the type of product received: ");
            String productstring = go.next();
            System.out.println("You entered: " + productstring);
            System.out.println("Please enter the cost to us for each " + productstring + ":");
            cost = go.nextInt();
            System.out.print("Please enter the Brand Name: ");
            brandname = go.next();
            System.out.print("Please enter the Number of " + productstring + " in shiptment: ");
            Numberinshiptment = go.nextInt();
            subtotalcost = (cost * Numberinshiptment);
            System.out.println("Shipment Summary: ");
            System.out.println("the new product is: " + productstring);
            System.out.println("This shipment included: " + Numberinshiptment + " " + productstring + " " + brandname + " brand ");
            System.out.println("The sub-total value of the shipment was $: " + ft.format(subtotalcost));

            System.out.println("Would you like enter a second product (y/n): ");
            prodYN = go.next();
        }

        while (prodYN.equals("Y") || prodYN.equals("y"));



//            System.out.println("Please enter another of product received: ");
//            productstring = go.nextLine();
//            System.out.println("You entered: " + productstring);
//            System.out.println("Please enter the cost to us for each: " + productstring);
//            cost = go.nextInt();
//            System.out.print("Please enter the Brand Name: ");
//            brandname = go.next();
//            System.out.print("Please enter the Number of " + productstring + " in shiptment: ");
//            Numberinshiptment = go.nextInt();
//            int totalcost = (cost * Numberinshiptment) + (cost * Numberinshiptment);
//            System.out.println("Shipment Summary: ");
//            System.out.println("the products are:" + "\n"+productstring);
//            System.out.println("This shipment included: " + "\n" + Numberinshiptment + " "+ productstring +" from " + brandname );
//            System.out.println("The total value of the shipment was $: " + ft.format(totalcost));
//            System.out.println("GST: " + ft.format((totalcost) * 1.05f));



            String productstring;

        if (prodYN.equals("n")  || prodYN.equals("N") ) {
            productstring = go.nextLine();
        System.out.println("thank you for you purchase, " + customerName + ".");
        System.out.println("Shipment Summary: ");
        System.out.println("the new product is: " + productstring);
        System.out.println("This shipment included: " + Numberinshiptment +" " +productstring+ brandname+ " brand ");
        System.out.println("The total value of the shipment was $: " + ft.format(subtotalcost));
        System.out.println("GST: " + ft.format(subtotalcost * 1.05f));

            } else {
            System.out.println("Please enter the type of product received: ");
            productstring = go.next();
            System.out.println("You entered: " + productstring);
            System.out.println("Please enter the cost to us for each: " + productstring);
            int cost1 = go.nextInt();
            System.out.print("Please enter the Brand Name: ");
            brandname = go.next();
            System.out.print("Please enter the Number of " + productstring + " in shiptment: ");
            int Numberinshiptment1 = go.nextInt();
            int totalcost = (cost * Numberinshiptment) + (cost1 * Numberinshiptment1);
            System.out.println("Shipment Summary: ");
            System.out.println("the products are:" +"\n"+ productstring);
            System.out.println("This shipment included: " + "\n" + Numberinshiptment + " "+ productstring +" from " + brandname);
            System.out.println("The total value of the shipment was $: " + ft.format(totalcost));
            System.out.println("GST: " + ft.format(totalcost * 1.05f));

        }
    }
}