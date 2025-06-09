
import java.util.Scanner;

public class switchStatement {
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
        switch(currentYear)
        {
            case 1: System.out.println("You're a freshman.");
                    break;
            case 2: System.out.println("You're a sophomore.");
                    break;
            case 3: System.out.println("You're a junior.");
                    break;
            case 4: System.out.println("You're a senior.");
                    break;
            default: System.out.println("Invalid.");
        }
        keyboard.close();
        
    }
}
