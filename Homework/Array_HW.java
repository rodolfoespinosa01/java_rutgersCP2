import java.util.Scanner;

public class Array_HW {
    public static void main(String[] args) {
        // step 1: declare variables
        double[] price = new double[10]; // prices of items
        int[] amount = new int[10]; // quantity for each item
        double[] total = new double[10]; // total = price * amount

        // step 2: get user inputs
        Scanner keyboard = new Scanner(System.in); 
        
        for (int index = 0; index < 10; index++) {
            
            System.out.print("What is the price for item " + (index + 1) + "?: ");
            price[index] = keyboard.nextDouble(); // store price in array

            System.out.print("What quantity amount do you have for item " + (index + 1) + "?: ");
            amount[index] = keyboard.nextInt(); // store amount in array

            // step 3: perform calculation for total
            total[index] = price[index] * amount[index];
        }

        // step 4: display results
        System.out.println(); // print blank line for spacing

        
        System.out.println(String.format("%-10s%-10s%-10s", "total", "price", "amount")); // header

        for (int index = 0; index < 10; index++) {
            // format each row and print it
            String row = String.format("%-10.2f%-10.2f%-10d", total[index], price[index], amount[index]);
            System.out.println(row);
        }
    }
}
/*
* String.format works like printf, but creates a formatted string instead of printing it
* %-10s: left-align text in a field 10 characters wide
* %-10.2f: left-align float with 2 decimal places
* %-10d: left-align integer in 10 character space
*/
