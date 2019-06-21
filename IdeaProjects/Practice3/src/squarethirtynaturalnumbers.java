import java.text.DecimalFormat;

import static java.lang.Math.sqrt;

public class squarethirtynaturalnumbers {
    public static void main(String[] args) {
        DecimalFormat ft = new DecimalFormat("0.00");

        int num = 0;
        while (num < 30) {
            num++;
            System.out.println(ft.format(sqrt(num)));
        }



    }

        }



