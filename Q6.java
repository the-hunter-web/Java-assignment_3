package assignment_3;

import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        //         Write a java program to calculate the monthly electricity bill. The tariff is given as 
        // follows:
        // Price per unit Unit range
        // Rs. 3/- First 50 units
        // Rs. 4.80/- 50-200 units
        // Rs. 5.80/- 200-400 units
        // Rs. 6.20/- Above 400 unit
        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter the unit of electricity used :");
        float unit = Sc.nextFloat();

        if (unit < 50 ) {
            System.out.println(unit * 3);
        } else if ( unit > 50 && unit < 200) {
            System.out.println((4.80 * unit) - ( 50 * 4.80) + (50 * 3) );
        } else if ( unit > 200 && unit < 400 ) {
            System.out.println((5.80 * unit ) - ( 200 * 5.80) + (50 * 3) + ( 150 * 4.80) );
        } else {
            System.out.println((6.20 * unit) - (400 * 5.80) + (50 * 3) + ( 150 * 4.80) + ( 200 * 5.80) ) ;
        }

    }
}

