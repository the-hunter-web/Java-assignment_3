package assignment_3;

import java.util.*;
import java.lang.Math;


public class Q4 {
    public static void main(String[] args) {
        //         Make a simple game involving a computer and a user. The computer first guesses a 
        // number between 1 and 9 inclusive, then ask the user to enter a number between 1 and 
        // 9 inclusive. If the user guess is correct then display “You got it right”, if the guess is 
        // close (+1, -1) “Almost got it “, Otherwise “You got it wrong”. 
        // Here are some sample runs.
        // Enter user number: 2
        // Computer guesses: 3
        // “Almost got it”
        // Enter user number: 4
        // Computer guesses: 4
        // “You got it right”
        // Enter user number: 1
        // Computer guesses: 5
        // “You got it wrong”
        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter a digit from 1-9 :");
        int a  = Sc.nextInt();

        int b = (int)(Math.random() * 10) + 1;
        System.out.println(b);

        // conditional statement 
        if (b == a + 1 || b == a - 1  ) {
            System.out.println("\"Almost got it \"");
        } else if (a == b ) {
            System.out.println("\"You got it right \"");
        } else {
            System.out.println("\"You got it wrong \"");
        }
    }
}
