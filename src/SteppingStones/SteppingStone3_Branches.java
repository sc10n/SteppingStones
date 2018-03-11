package SteppingStones;

import java.util.Scanner;

/**
 *
 * @author James Thompson
 * Stepping Stone Lab 3: Branches
 */
public class SteppingStone3_Branches {

    public static void main(String[] args) {
        int numberCups = -1;
//        Constant variable for max amount of cups.
        final int MAX_CUPS = 100;

//        Instantiate new scanner object.
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter the number of cups (between 1 and 100): ");

        //The following "if branch" uses the scanner method hasNextInt() to
        //check to see if the input is an int.
        if (scnr.hasNextInt()) {
            numberCups = scnr.nextInt();
//            2nd Nest level: check if entered value is >=1 and <= MAX_CUPS
            if ((numberCups >= 1) && (numberCups <= MAX_CUPS)) {

                System.out.println("Good job! The number you entered is " + numberCups);
            } else {
                System.out.println("The number entered was not between 1 and 100");
                System.out.println("Please enter a valid number of cups between 1 and 100: ");
//                3rd Next level: if not in correct range get a new input and check
//                for int type
                if (scnr.hasNextInt()) {
                    numberCups = scnr.nextInt();
//                    4th Nest level: checking the second input attempt for correct
//                    range. 
                    if ((numberCups >= 1) && (numberCups <= MAX_CUPS)) {
                        System.out.println("Good job! The number you entered is " + numberCups);
                    } else if (numberCups < 1) {
                        System.out.println(numberCups + " is less than 1. Sorry, you are out of attempts.");
                    } else {
                        System.out.println(numberCups + " is grater than 100. Sorry, you are out of attempts.");
                    }
//                    This catches type mismatch in second attempt.
                } else {
                    System.out.println("Error: That is not a number. Try again.");
                }
            }
//            This catches type mismatch in first attempt.
        } else {
            System.out.println("Error: That is not a number. Try again.");
        }
    }
}

/**
 * Reflection: These nested branches are to check whether or not the entered value
 * passed to the scanner object is an integer. The first layer of the nest is to
 * grab the initial entered value and check the data type with .hasNextInt(). If
 * the value is an integer, it is passed to the second nested layer, if not it will
 * be pass to the final else statement to throw the error. The second nest layer
 * check the value is within the prescribed range, if it is, the "Good job!"
 * statement is printed and the process ends. However, if the value is less than
 * 1 or greater than 100 the else statement is processed. This else statement 
 * includes the third nested layer to check the second input is an integer, if it is 
 * not, the final else within this section of the loop is executed and the process 
 * will end. The fourth nested layer is a repeat of the second layer to check the 
 * input value lies between the specified values. This layer differs as it include 
 * an "else if" check as it provides two separate error messages for less than 1 
 * and greater than 100 and will end the process.
 * 
 * At first I thought I had completed the lab correctly. It would run through 
 * correctly when a correct value was entered. However, after testing it further
 * I found that if you entered a non-integer during the second attempt it would
 * throw a type mismatch exception. So I had to go through several iterations of
 * nesting the ifs correctly for the process to run correctly. Ultimately, my
 * issue was that I had the third nested layer outside the the else statement 
 * directly above it. So it wouldn't catch the second attempt of input when the
 * first attempt wasn't correct. This problem took me quite a while to work 
 * through, I even resorted to pencil and paper (no white board in the house)
 * to "map" out the expected logic and compare it to what my code was doing.
 *
 */

