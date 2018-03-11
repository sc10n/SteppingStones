package SteppingStones;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * @author James Thompson
 * Stepping Stone Lab 2: Ingredient Calculator
 *
 **/
public class SteppingStone2_IngredientCalculator {

    /**
     * @param args the command line arguments
     **/
    public static void main(String[] args) throws InputMismatchException {

//      Variables initialized as per Step A of Guidelines
        String nameOfIngredient = "";      // String variable initialized empty
        double numberCups = 0.0;           // Double variable initialized to 0.0 to store fractions of cups
        int numberCaloriesPerCup = 0;      // Integer variable initialized at 0 for whole numbers
        double totalCalories = 0.0;        // Double variable intialized to 0.0 to store fractions of calories

//      Instantiate new scanner object
        Scanner scnr = new Scanner(System.in);

//       Grab first input for ingredient name
        System.out.println("Please enter the name of the ingredient: ");
        nameOfIngredient = scnr.next();

//       Grab double for number of cups
        System.out.println("Please enter the number of cups of "
                + nameOfIngredient + " we'll need: ");
        numberCups = scnr.nextDouble();

//       Grab integer from next keyboard input for calories per cup.
        System.out.println("Please enter the name of calories per cup: ");
        numberCaloriesPerCup = scnr.nextInt();

        /**
         * Expression that calculates the total calories of the ingredient by
         * multiplying the number of cups by the number of calories per cup.
         **/
        totalCalories = numberCups * numberCaloriesPerCup;

//        Finally, print out the whole statement.
        System.out.println(nameOfIngredient + " uses " + numberCups
                + " cups and has " + totalCalories + " calories.");

    }

}

/**
 * 
 * Reflection
 *
 * This week's assignment was to build up the data types for the ingredient class
 * of our final project. The guidelines gave the types of data each variable should
 * be assigned. As the name of the ingredient would be a text name, I assigned 
 * nameOfIngredient as a string and initialized it as empty, since it did not 
 * require an initial value. The numberCups and totalCalories are decimal numbers
 * that may be required to contain fractions, I assigned the type as double since
 * we are not in a memory saving situation. As numberCaloriesPerCup is defined 
 * as a whole number I assigned it as an integer. 
 * 
 * I didn't find any difficulties with the required portion of the assignment.
 * However, what I have had trouble with is exception handling when the wrong 
 * type of input is entered. I found the InputMismatchException handler to trap
 * these and added it as a "throws" in the class, but I had difficulties with 
 * finding the correct method of catching the input then returning to the prompt
 * to grab and check the new input. I found the .hasNextInt() method and I am 
 * still exploring how to properly use it going forward for the final project.
 * 
 * For the expression I just multiplied the two variables numberCups and 
 * numberCaloriesPerCup and assigned the result to totalCalories.
 **/

