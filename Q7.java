package assignment_3;

import java.util.*;

public class Q7 {
    public static void main(String[] args) {

        //         From the above question no. (6) write a java program with a choice if the consumer 
        // wants to pay bill online. Consumer who pays their electricity bill online will get a
        // discount of 3%
        // Here is the sample output:
        // No. of units consumed: 867
        // Do you want to pay online(y/n): y
        // Total amount: 4925.4
        // Discount: 147.762
        // Amount payable: 4777.638

        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter the unit of electricity used : ");
        int unit = Sc.nextInt();

        float a = (unit * 3);
        float b = ((unit * 4.80f) - (50 * 4.80f ) + (50 * 3));
        float c = ((unit * 5.80f) - (200 * 5.80f) + (50 * 3) + (150 * 4.80f) ) ;
        float d = ((unit * 6.20f) - (400 * 6.20f) +(50 * 3) + (150 * 4.80f) + (200 * 5.80f) );

        System.out.println("Do you want to pay online (y/n) : ");
        char choice = Sc.next().charAt(0);

        if ( choice == 'y') {
            System.out.println("You will get a discount of 3% .");
            if (unit <= 50 ) {
                System.out.print(unit + " units of electricity costs rs :"  );
                System.out.println( a-(a*3.0f/100) );
            } else if (unit > 50 && unit < 200) {
                System.out.print(unit + " units of electricity costs rs :"  );
                System.out.println( b-(b*3.0f/100) );
            } else if (unit > 200 && unit < 400) {
                System.out.print(unit + " units of electricity costs rs :"  );
                System.out.println( c-(c*3.0f/100) );
            }  else {
             System.out.print(unit + " units of electricity costs rs :"  );
                System.out.println( d-(d*3.0f/100) );
            }
        }   else if ( choice == 'n') {
            if (unit <= 50) {
                System.out.print(unit + " units of electricity costs rs :"  );
                System.out.println(a);
            } else if (unit > 50 && unit < 200) {
                System.out.print(unit + " units of electricity costs rs :"  );
                System.out.println(b);
            } else if (unit > 200 && unit < 400) {
                System.out.print(unit + " units of electricity costs rs :"  );
                System.out.println(c);
            } else {
                System.out.print(unit + " units of electricity costs rs :"  );
                System.out.println(d);
            }
        }  else {
            System.out.println("Please choose a valid a valid method of payment ");
            
        }
    
    }
}