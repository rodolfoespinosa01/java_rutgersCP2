import java.util.Scanner;

public class NestedStatement {
    public static void main (String[] args)
    {
        //step 1: variable declarations
        Scanner keyboard = new Scanner (System.in);
        String school, major;

        //step 2: ask user inputs
        System.out.print("Enter your school name: ");
        school = keyboard.nextLine();

        System.out.print("Enter your major: ");
        major = keyboard.nextLine();
        //step 3: list of operations

        //step 4: display
        if(school.equals("Rutgers"))
        {
            if(major.equals("CS") || major.equals("DS"))
            {
                System.out.println("You need to take a few programming language classes.");
            }
            else
            {
                System.out.println("No need to take programming language classes.");
            }
        }
        else
        {
            System.out.println("You must be a Rutgers Student");
        }
        keyboard.close();
    }
}
