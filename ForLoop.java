//May 29

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args)
    {
        //step 1: variable declaration
        Scanner input = new Scanner (System.in);
        double grade, total=0.0, average = 0.0;
        int size;

        System.out.println("How many grades to enter?");
        size = input.nextInt();


        // step2: ask user input
        for (int index = 0; index < size; index++)
        {
            System.out.print("Enter grade " + (index+1) +": " );
            grade = input.nextDouble();
            while(grade < 0 || grade > 100)
            {
                System.out.print("Please enter a value between 0 and 100: ");
                grade = input.nextDouble();
            }
            total = total + grade;
        }

        if( size > 0) {
            //step 3: list of operations
            average = total/size;

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
        } else {
            System.out.println("You have no grades entered.");
        }
        
        
    }
}
