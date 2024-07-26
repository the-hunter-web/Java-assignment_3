package assignment_3;

import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        //         Write a java program that takes the x – y coordinates of a point in the Cartesian plane 
        // and prints a message telling either an axis on which the point lies or the quadrant in 
        // which it is found.
        // Here is the sample output: 
        // (-1.0, -2.5) is in quadrant III 
        // (0.0, 4.8) is on the y-axis
        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter the x-axis coordinate :");
        float x = Sc.nextFloat();
        System.out.println("Enter the y-axis coordinate :");
        float y = Sc.nextFloat();

        // System.out.println("( " + x + " , " + y + " )" );
        if (x == 0 && y ==0) {
            System.out.println("( " + x + " , " + y + " )" + " is on the origin .");
        }else if (x == 0) {
            System.out.println("( " + x + " , " + y + " )" + " is on the y-axis .");
        } else  if (y == 0) {
            System.out.println("( " + x + " , " + y + " )" + " is on the x-axis .");
        }   else  if (x > 0 && y > 0) {
            System.out.println("( " + x + " , " + y + " )" + " is in the 1st Quadrant .");
        }   else  if (x > 0 && y < 0) {
            System.out.println("( " + x + " , " + y + " )" + " is in the 4th Quadrant .");
        }    else  if (x < 0 && y > 0) {
            System.out.println("( " + x + " , " + y + " )" + " is in the 2nd Quadrant .");
        }     else  if (x < 0 && y < 0) {
            System.out.println("( " + x + " , " + y + " )" + " is in the 3rd Quadrant .");
        }
    }
}
