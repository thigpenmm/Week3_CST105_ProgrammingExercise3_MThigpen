/**Program: Guessing Game Program
 *File: GuessingGame.java
 *Summary: User takes 3 guesses to select a random integer.
 *Author: Mercedes Thigpen
 *Date: March 6, 2018
 **/

import java.util.Scanner;
public class GuessingGame {
   
    public static void main(String[] args) {
        
        int number1 = (int)(Math.random() * 10000);
           //number1 is a randomly selected integer between 1 and 10000.
         Scanner input = new Scanner(System.in);
        System.out.println("Enter a guess between 1 and 10000.");
        int answer = input.nextInt(); //number entered by the player into the Scanner
        if (number1 >= answer)
           System.out.println("HIGHER");
        else if (number1 <= answer)
            System.out.println("LOWER");
        else 
            System.out.println("YOU WIN!");
        
        int number2 = (int)(Math.random() * 1000);   
        //number2 is a randomly selected integer 1 and 1000.
        System.out.println("Enter a guess between 1 and 1000.");
        int answer2 = input.nextInt(); //number entered by the player into the Scanner
        if (number2 >= answer2)
           System.out.println("HIGHER");
        else if (number2 <= answer)
            System.out.println("LOWER");
        else 
            System.out.println("YOU WIN!");
     
        int number3 = (int)(Math.random() * 100);    
        //number3 is a randomly selected integer between 1 and 100.
        System.out.println("Enter a guess between 1 and 100.");
        int answer3 = input.nextInt(); //number entered by the player into the Scanner
        System.out.println("You WIN, it took you 3 guesses.");
        //End of the program. The player always wins by the third guess.
    }
    
}
