import java.util.Scanner;

public class Payroll
{
    public static void main(String[] args)
    {
        //step 1: variable declarations
        Scanner keyboard = new Scanner(System.in);
        double hourlyRate, grossPay, fedAmt, stateAmt, netPay;
        final double fedRate = 0.02, stateRate = 0.03;
        int hours;

        //step 2: ask user inputs
        System.out.print("Enter your hourly rate: ");
        hourlyRate = keyboard.nextDouble();
        System.out.print("Enter total hours: ");
        hours = keyboard.nextInt();

        //step 3: list of operations
        grossPay = hourlyRate * hours;
        fedAmt = grossPay * fedRate;
        stateAmt = grossPay * stateRate;
        netPay = grossPay - fedAmt - stateAmt;

        //step 4: display
        System.out.println("\nGross pay is " + grossPay);
        System.out.println("Federal tax amount is " + fedAmt);
        System.out.println("State tax amoutn is " + stateAmt);
        System.out.println("Net pay is " + netPay);

        keyboard.close();
    }
}
