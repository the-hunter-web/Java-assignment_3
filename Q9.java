package assignment_3;

import java.util.*;

public class Q9 {
    public static void main(String[] args) {

        //         Write a program to input 3 integer number a, b, c. Find the largest number among 3. 
        // Also find the 2nd largest number among 3. Here is the sample output:
        // Enter the value of a, b, c:10 30 50
        // Largest number: 50
        // 2nd largest number: 30
        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter the 1st number :");
        int a = Sc.nextInt();
        System.out.println("Enter the 2nd number :");
        int b = Sc.nextInt();
        System.out.println("Enter the 3rd number :");
        int c = Sc.nextInt();

        if ( a > b && a > c) {
            System.out.println("largest number among " + a + " , " + b + " , " + c + " is " + a) ;
            if (b>c) {
                System.out.println("2nd largest number among " + a + " , " + b + " , " + c + " is " + b);
            } else {
                System.out.println("2nd largest number among " + a + " , " + b + " , " + c + " is " + c);
            }
        } else if ( b > a && b > c) {
            System.out.println("largest number among " + a + " , " + b + " , " + c + " is " + b) ;
            if (a>c) {
                System.out.println("2nd largest number among " + a + " , " + b + " , " + c + " is " + a);
            } else {
                System.out.println("2nd largest number among " + a + " , " + b + " , " + c + " is " + c);
            }
        } else if ( c > b && c > a) {
            System.out.println("largest number among " + a + " , " + b + " , " + c + " is " + a) ;
            if (b>a) {
                System.out.println("2nd largest number among " + a + " , " + b + " , " + c + " is " + b);
            } else {
                System.out.println("2nd largest number among " + a + " , " + b + " , " + c + " is " + c);
            }
        }
    }
}