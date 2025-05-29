import java.util.Scanner;
public class doWhile {
    public static void main(String[] args) {
        
        // step 1, define variables
        Scanner keyboard = new Scanner (System.in); // introduce keyboard to system to allow user inputs
        double grade; // assign 'grade' varibale to be a decimal
        double total = 0; //assign 'total' variable to be a decimal

        int count = 0; // use this variable later to capture the amount of entries the user does, this will be the denominator when getting the average

        //step 2, get input from user
        
        do {
            System.out.print("Enter a grade between 0 to 100. (Enter 999 to exit and get average): "); // display this message to the user
            grade = keyboard.nextDouble(); //allow user to input a decimal number

        if (grade == 999) { 
            break; // this is where we break out of the infinite loop
        } else if (grade < 0 || grade > 100) { // only accept numbers between 0 and 100
            System.out.println("Please re-enter grade. Invalid entry. Eneter grade between 0 and 100.");
        } else {
            total = total + grade;
            count = count + 1;
        }
        } while (true); // we use an infinite loop and break it in the inside. in order to use this infinite loop, it must run at least once, which is why we dont use while (grade !== 999)

        if (count > 0) {
            double average = total / count;
            System.out.printf("Average of %d valid grade(s): %.2f%n", count, average);
        } else {
            System.out.println("No valid grades were entered.");
        }
    }
}