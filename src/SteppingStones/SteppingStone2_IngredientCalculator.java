package SteppingStones;

import java.util.Scanner;
/**
 *
 * @author James Thompson
 * @title Stepping Stone Lab 2: Ingredient Calculator
 * @date 01-March-2018
 */
public class SteppingStone2_IngredientCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//      Variables initialized as per Step A of Guidelines
        String nameOfIngredient = "";      // String variable initialized empty
        double numberCups = 0.0;           // Double variable initialized to 0.0 to store fractions of cups
        int numberCaloriesPerCup = 0;      // Integer variable initialized at 0 for whole numbers
        double totalCalories = 0.0;        // Double variable intialized to 0.0 to store fractions of calories


       Scanner scnr = new Scanner(System.in);
       
       System.out.println("Please enter the name of the ingredient: ");
       nameOfIngredient = scnr.next();
       
       System.out.println("Please enter the number of cups of " 
        + nameOfIngredient + " we'll need: ");
       numberCups = scnr.nextFloat();
       
       System.out.println("Please enter the name of calories per cup: ");
       numberCaloriesPerCup = scnr.nextInt();

    /**
     *  Expression that calculates the total calories of the ingredient by multiplying the number of cups by the
     *  number of calories per cup.
     */
        totalCalories = numberCups * numberCaloriesPerCup;
       
       System.out.println(nameOfIngredient + " uses " + numberCups 
       + " cups and has " + totalCalories + " calories.");
       
    }
    
}

/**
 * 
 * Final Project
 *
 *For your Final Project:
 *
 * 1. Create a new java class named Ingredient
 * 
 * 2. Adapt the code from this SteppingStone to include the following changes:
 *
 *   a. Rename the variable, numberCups, to represent the more general 
 *      ingredientAmount;
 *
 *   b. Add a new text variable, unitMeasurement to store unit of measurement
 *      for the ingredient amount (e.g. cups, oz., etc.);
 *
 *   c. Prompt the user to input the measurement unit;
 * 
 * /

