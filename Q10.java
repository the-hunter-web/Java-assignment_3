package assignment_3;

import java.util.*;

public class Q10 {
    public static void main(String[] args) {

        //         A University conducts a 100-mark exam for its student and grades them as follows. 
        // Assigns a grade based on the value of the marks. Write a java program to print the 
        // grade according to the mark secured by the student. [Use switch-case].
        // Mark Range Letter Grade
        // >=90 O
        // >=80 AND <90 A
        // >=70 AND <80 B
        // >=60 AND <70 C
        // >=50 AND <60 D
        // >=50 AND <40 E
        // <40 F

        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter the marks : ");
        int marks = Sc.nextInt();

        // if (marks >= 90 && marks >= 100) {
        //     System.out.println("O");
        // } else if (marks >= 80 && marks < 90) {
        //     System.out.println("A");
        // } else if (marks >= 70 && marks > 80) {
        //     System.out.println("B");
        // } else if (marks >= 60 && marks < 70) {
        //     System.out.println("C");
        // } else if (marks >= 50 && marks < 60) {
        //     System.out.println("D");
        // } else if (marks >= 40 && marks < 50) {
        //     System.out.println("E");
        // } else if (marks > 0 && marks < 40){
        //     System.out.println("F");
        // }

        switch (marks /10 ) {
            case 10 : 
            case 9 : System.out.println("O");
            break;

            case 8 : System.out.println("A");
            break;

            case 7 : System.out.println("B");
            break;

            case 6 : System.out.println("C");
            break;

            case 5 : System.out.println("D");
            break;

            case 4 : System.out.println("E");
            break;

            case 3 :
            case 2 :
            case 1 :
            case 0 :System.out.println("F");
            break;
        }
    }
    
}
