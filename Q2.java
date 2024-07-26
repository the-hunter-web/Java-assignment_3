package assignment_3;

import java.util.*;

public class Q2 {
    public static void main (String [] args) {
        //         Alice visited SUM hospital to get treatment for her fever and illness. Doctor advised 
        // her to drink at least 5000 ml of water each day. Alice drank x ml of water today. Write 
        // a program that print the following message depending on the value of x.
        // “Yes, Alice is following doctor’s advice” 
        // OR
        // “No, Alice is not following doctor’s advice”

        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter the amount of water drank by Alice in ml :");
        int water_ml = Sc.nextInt();

        // conditional statement
        if (water_ml >= 5000) {
            System.out.println("\" Yes 'Alice is following Doctor's advice \"");
        }  else {
            System.out.println("\"No , Alice is not folowing doctor's advice \"");
        }
    }
    
}
