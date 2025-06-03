//May 28
//Multi Branch

import java.util.Scanner;

public class SchoolYear {
    public static void main(String[] args)
    {
        //step 1: variable declaration
        Scanner keyboard = new Scanner (System.in);
        int currentYear;

        // step2: ask user input
        System.out.print("Enter your year: ");
        currentYear = keyboard.nextInt();

        //step 3: list of operations

        //step 4: display
        if(currentYear == 1)
        {
            System.out.println("You're a freshman'.");
        }
        else if(currentYear == 2)
        {
            System.out.println("You're a sophomore'.");
        }
        else if(currentYear == 3)
        {
            System.out.println("You're a junior'.");
        }
        else
        {
            System.out.println("You're a senior'.");
        }

        keyboard.close();
        
    }
}
