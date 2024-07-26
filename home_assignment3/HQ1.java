package assignment_3.home_assignment3;
import java.util.*;
public class HQ1 {
    public static void main (String [] args ) {
        // 0-> scissors ,  1-> rock , 2-> paper;
        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter your game ");
        int guess = Sc.nextInt();
        int random = ((int)(Math.random()*2)+0);
        System.out.println("Computer guesses = " + random );
        if( (guess == 1 && random == 0 ) || (guess == 0 && random == 2) || (guess == 2 && random == 1) ) {
            System.out.println("You win ");
        } else {
            System.out.println("you loose");
        }
    }
}
