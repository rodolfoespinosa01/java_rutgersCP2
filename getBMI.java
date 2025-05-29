import java.util.Scanner;

public class getBMI {
    public static void main(String[] args)
    {
        //step 1, define variables
        Scanner keyboard = new Scanner (System.in); // introduce keyboard to system to allow user inputs
        double weight, height; // assign 'weight,height' to be a decimal

        // step 2, get user inputs
        System.out.print("Enter your current weight in pounds: "); //display message to user
        weight = keyboard.nextDouble(); //allow user to enter a decimal number
        System.out.print("Enter your current height in inches: ");//display message to user
        height = keyboard.nextDouble(); //allow user to enter a decimal number

        // step 3: list of operations
        double bmi = (weight * 703)/(height*height); //cacluclate BMI based on assignment formula for BMI

        if (bmi > 25) {
            System.out.println("You are overweight."); //if bmi over 25, display this message to user
        } else if(bmi >= 18.5 && bmi <= 25) {
            System.out.println("You have an optimal weight."); 
        } else {
            System.out.println("You are underweight."); //if bmi under 18.5, display this message to user
        }
    }
}

/*
 * clarify with instructor
 * what if the user enters a letter, do you want to display a message and ask for input again?
 * what if user enters unrealistic numbers?
 * what if user wants to enter kilos/cm?
 */