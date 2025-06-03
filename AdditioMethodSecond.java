//June3
import java.util.Scanner;

public class AdditioMethodSecond {
    public static void main(String[] args)
    {
        //step 1: variable delcaration
        Scanner keyboard = new Scanner(System.in);
        int num1, num2;

        //step 2: ask user inputs
        System.out.print("Please enter number 1: ");
        num1 = keyboard.nextInt();

        System.out.print("Please enter number 2: ");
        num2 = keyboard.nextInt();

        // call addition method
        addition(num1, num2);

        keyboard.close();
    }

    public static void addition (int x, int y)
    {
        // step 3: list of operations
        int sum = x + y;

        //step 4: display
        System.out.println("The sum of " + x + " and " + y + " is " + sum);
    }
    
}
