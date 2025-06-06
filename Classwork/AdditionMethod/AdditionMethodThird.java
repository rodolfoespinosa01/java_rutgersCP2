import java.util.Scanner;

public class AdditionMethodThird {
    public static void main(String[] args)
    {
        //step 1: variable delcaration
        Scanner keyboard = new Scanner(System.in);
        int num1, num2, x;

        //step 2: ask user inputs
        System.out.print("Please enter number 1: ");
        num1 = keyboard.nextInt();

        System.out.print("Please enter number 2: ");
        num2 = keyboard.nextInt();

        // call addition method
        x = addition(num1, num2);

        //step 4: display
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + x);
        
        keyboard.close();
    }

    public static int addition (int x, int y)
    {

        //step 3 list of operations;
        int sum = x + y;

        return sum;
        
    }
    
}
