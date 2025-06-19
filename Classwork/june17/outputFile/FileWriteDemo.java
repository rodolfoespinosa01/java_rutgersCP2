import java.util.Scanner;
import java.io.*;

public class FileWriteDemo
{
    public static void main(String[] args) throws IOException
    {
        Scanner keyboard = new Scanner(System.in);
        String fileName, friendName;
        int numFriends;

        System.out.print("How many friends: ");
        numFriends = keyboard.nextInt();
        
        keyboard.nextLine();

        //step 0: enter file name
        System.out.print("Enter a file name: ");
        fileName = keyboard.nextLine();
        
        //step 1: open
        PrintWriter outputFile = new PrintWriter(fileName);
        
        //step 2: write
        for(int i = 1; i <= numFriends; i++)
        {
            System.out.print("Enter friend name " + i + ": ");
            friendName = keyboard.nextLine();

            outputFile.println(friendName);
        }
        
        //step 3: close
        outputFile.close();
        System.out.println("Success!");
        
    }
}