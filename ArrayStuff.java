/*
 * Programmer:
 * Date:
 * Purpose:
 */

import java.util.Scanner;

public class ArrayStuff {
    public static void main (String[] args) {
        // Create the input scanner
        Scanner input = new Scanner(System.in);
        int user  = input.nextInt();

        // PART A

        //Create integer array called "ages" with length 5.
        int [] ages = new int [5];


        //Change the 3rd element of "ages" to be 18
        ages [2] = 18;


        //  Change the first element of "ages" to be an integer entered by the user
        System.err.println("Enter an integer:");
        ages [0] = input.nextInt();


        // Change the last element of "ages" to be the first element squared
        ages [4] = (int)Math.pow(ages [0], 2);


        // Print all of the elements of "ages", one per line
        System.out.print(ages);



        // PART B

        // TODO: Create AND initialize an array called "planets" that holds the
        // names of the planets in order from closest to the sun to farthest.
        // NOTE: Pluto is NOT a planet.


        // TODO: Print the first letter of the 7th planet from the sun


        // TODO: Change the name of our planet to be a line of text that the user inputs
        System.err.println("What do you want to rename Earth to be?");


        // TODO: Replace the first planet with the planet at index 2, but with all
        // upper case letters.


        // TODO: Print all of the elements of "planets" in reverse order.

    }
}
