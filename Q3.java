package assignment_3;

import java.util.*;

public class Q3 {
    public static void main (String args []) {

        //         Write a program that reads three integers from the user and prints "Increasing" if the 
        // numbers are in increasing order, "Decreasing" if the numbers are in decreasing order, 
        // and "Neither increasing nor decreasing order" otherwise. 
        // Here is sample run: 
        // Input first number: 241 
        // Input second number:345 
        // Input third number: 4563 
        // “Increasing”
        // Input first number: 345
        // Input second number:145
        // Input third number: 563 
        // “Neither Increasing nor decreasing”
        // Input first number: 45
        // Input second number:14
        // Input third number: 3 
        // “Decreasing”
        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter the 1st number :");
        int a = Sc.nextInt();

        System.out.println("Enter the 2nd number :");
        int b = Sc.nextInt();

        System.out.println("Enter the 3rd number :");
        int c = Sc.nextInt();
        
        // conditional statement 
        if (a < b && b < c) {
            System.out.println("INCREASING ");
        } else if ( a > b && b > c ) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing nor decreasing order ");
        }

    }
    
}
