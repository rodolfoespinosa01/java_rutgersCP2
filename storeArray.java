//June 2

import java.util.Scanner;

public class storeArray {
   public static void main(String[] args) 
   {
    //step 1: variable declaration
    Scanner keyboard = new Scanner (System.in);
    int total=0, size;
    double average;

    System.out.print("How many grades to enter? ");
    size = keyboard.nextInt();
    int [] grades = new int[size];

    //step 2: ask user input
    for (int index = 0; index < size; index++) 
    {
        System.out.print("Eneter a grade: ");
        grades[index] = keyboard.nextInt();

        while(grades[index] < 0 || grades[index] > 100)
        {
            System.out.print("Please enter a value between 0 and 100: ");
            grades[index]= keyboard.nextInt();
        }
        total = total + grades[index];
    }

    if( size > 0) {
            //step 3: list of operations
            average = total/size;

            //step 4: display
            System.out.println("The average of your three grades are: " + average);
            if(average >= 90 && average <= 100)
            {
                System.out.println("Your letter grade is A.");
                System.out.println("Your average is " + average);
            }
            else if(average >= 80 && average < 90)
            {
                System.out.println("Your letter grade is B.");
                System.out.println("Your average is " + average);
            }
            else if(average >= 70 && average < 80)
            {
                System.out.println("Your letter grade is C.");
                System.out.println("Your average is " + average);
            }
            else if(average >= 60 && average < 70)
            {
                System.out.println("Your letter grade is D.");
                System.out.println("Your average is " + average);
            }
            else
            {
                System.out.println("Your letter grade is F.");
                System.out.println("Your average is " + average);
            }
        } else {
            System.out.println("You have no grades entered.");
        }

    keyboard.close();
   }
}
