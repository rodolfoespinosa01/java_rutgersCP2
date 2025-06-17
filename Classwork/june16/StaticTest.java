import java.util.*;

public class StaticTest
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double base, exp, number1, ans1, ans2;

        System.out.print("Enter a base: ");
        base = keyboard.nextDouble();

        System.out.print("Enter an exponent");
        exp = keyboard.nextDouble();

        ans1 = Math.pow(base, exp);
        System.out.println("The answer 1 is: " + ans1);

        System.out.print("Enter a number: ");
        number1 = keyboard.nextDouble();

        ans2 = Math.sqrt(number1);
        System.out.println("The answer 2 is "+ ans2);


    }
}