import java.util.Scanner;

public class AverageAge {
    public static void main(String[] args)
    {
        //step 1: variable declaration
        Scanner keyboard = new Scanner (System.in);
        double gradeOne, gradeTwo, gradeThree, average;

        // step2: ask user input
        System.out.print("Enter your first grade: ");
        gradeOne = keyboard.nextDouble();

        System.out.print("Enter your second grade: ");
        gradeTwo = keyboard.nextDouble();

        System.out.print("Enter your third grade: ");
        gradeThree = keyboard.nextDouble();

        //step 3: list of operations
        average = (gradeOne + gradeTwo + gradeThree)/3;

        //step 4: display
        System.out.println("The average of your three grades are: " + average);
        if(average >= 90 && average <= 100)
        {
            System.out.println("Your letter grade is A.");
        }
        else if(average >= 80 && average < 90)
        {
            System.out.println("Your letter grade is B.");
        }
        else if(average >= 70 && average < 80)
        {
            System.out.println("Your letter grade is C.");
        }
        else if(average >= 60 && average < 70)
        {
            System.out.println("Your letter grade is D.");
        }
        else
        {
            System.out.println("Your letter grade is F.");
        }
        
    }
}
