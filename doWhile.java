import java.util.Scanner;
public class doWhile {
    public static void main(String[] args) {
        
        // step 1, define variables
        Scanner keyboard = new Scanner (System.in); // introduce keyboard to system to allow user inputs
        double grade; // assign 'grade' varibale to be a decimal
        double total = 0; //assign 'total' variable to be a decimal and also set to 0 at first

        int count = 0; // use this variable later to capture the amount of entries the user does, this will be the denominator when getting the average and also set to 0 at first

        //step 2, get input from user
        
        do {
            System.out.print("Enter a grade between 0 to 100. (Enter 999 to exit and get average): "); // display this message to the user
            grade = keyboard.nextDouble(); //allow user to input a decimal number

        if (grade == 999) { 
            break; // this is where we break out of the infinite loop
        } else if (grade < 0 || grade > 100) { // only accept numbers between 0 and 100
            System.out.println("Please re-enter grade. Invalid entry. Eneter grade between 0 and 100.");
        } else {
            total = total + grade; // can also be written as total += grade - this will get the current total and add the new grade entered by the user

            count = count + 1; // each time there is a valid grade entered, count will keep adding by 1. this can also be written as count ++
        }
        } while (true); // we use an infinite loop and break it in the inside. in order to use this infinite loop, it must run at least once, which is why we dont use while (grade !== 999)

        if (count > 0) {
            double average = total / count; // get average
            System.out.printf("The average of your grades are: %.2f", average);  
            // %.2f this tells Java that this is a floating number with 2 places to the right, coming from the variable called 'average'
            
        } else {
            System.out.println("No valid grades were entered."); //if user enters 999 without entering any numbers, display this message
        }
    }
}

/*
 * clarify with instructor
 * what if the user enters a letter, do you want to display a message and ask for input again?
 */