//import javax.swing.JFrame;
//
//import javax.swing.*;
//import javax.swing.text.StyledEditorKit;
//import javax.swing.*;
//import java.awt.*;
//import java.text.MessageFormat;
import java.util.Scanner;
//import java.awt.Font;
//import java.awt.Graphics;


public class OddOrEven{
    public static void main(String[] args) {

        Scanner sal = new Scanner(System.in);
        System.out.print("enter an integer: ");
        int integer = sal.nextInt();

//        Font g = new Font("Times New Roman",Font.BOLD,12);
//        String g1;
//        g1 = Font.getFont("even");



        if (integer % 2 == 0) {
            System.out.println(+integer + " is an " + "even" + " number");
        } else
            System.out.println(+integer + " is an odd number");





    }

    //public class drawingComponent extends JComponent {
//        public void paintComponent(Graphics g) {
//            Graphics2D g2 = (Graphics2D) g;
//            g2.setColor(new Color(255, 0, 0));
//            g2.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 14));
//            g2.drawString("Even", 40, 50);

}
