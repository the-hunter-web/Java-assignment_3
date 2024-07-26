package assignment_3;

import java.util.*;
import java.lang.Math;

public class Q5 {
    public static void main (String [] args ) {
        //         Write a Java program that takes a year from user and print true if that year is a leap year 
        // otherwise print false. 
        // Here is a sample run:
        // Input the year: 2016
        // 2016 is a leap year: true
        // Input the year: 2008
        // 2008 is a leap0 year: false
        // Input the year: 1900
        // 1900 is a leap year: false

        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter the year to check for leap year :");
        int year = Sc.nextInt();

        if ((year % 4 == 0 ) && ((year % 400 == 0) || (year % 100 != 0 ))) {
            System.out.println("leap year ");
        } else {
            System.out.println("Not a leap year");
        }
        
    }
}
