
import java.util.Scanner;

public class SimpleIf {
    public static void main(String[] args)
    {
        //step 1: variable decalration
        Scanner keyboard = new Scanner (System.in);
        int age;

        //step 2: ask user input
        System.out.print("Enter your age: ");
        age = keyboard.nextInt();

        //step 3: list of operations

        //step 4: display
        if(age < 1 || age > 110)
        {
            System.out.println("Invalid age");
        }
        else
        {
            System.out.println("Your age is " + age);
        }
        
        keyboard.close();
    }
}
