package assignment_3;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        
        //         Write a program to input the age of a person and check if the age of the person is 
        // greater than or equal to 18 then print the message:
        // “You are eligible to cast your vote”.

        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter the age of the person :");
        int age = Sc.nextInt();

        // conditional statement 
        if ( age >= 18 ) {
            System.out.println("\"You are eligible to caste your vote \"");
        } 
    }
    
}
