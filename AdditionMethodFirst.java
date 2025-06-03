import java.util.Scanner;

public class AdditionMethodFirst 
{
    public static void main(String[] args)
    {
        addition();
    }
    public static void addition()
    {
        //step 1
        Scanner keyboard = new Scanner (System.in);
        int num1, num2, sum;
        //step 2
        System.out.print("Please enter number 1: ");
        num1 = keyboard.nextInt();

        System.out.print("Please enter number 2: ");
        num2 = keyboard.nextInt();
        //step 3
        sum = num1 + num2;
        //step 4
        System.out.println("The sum of " + num1 + " and " + num2 +" is " + sum);
    }
}
