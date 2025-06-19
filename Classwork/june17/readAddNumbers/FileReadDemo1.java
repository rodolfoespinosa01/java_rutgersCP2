//myNumbers.txt

import java.util.Scanner;
import java.io.*;

public class FileReadDemo1
{
    public static void main(String[] args) throws IOException
    {
        Scanner keyboard = new Scanner(System.in);
        String fileName;
        double sum=0.0;

        //step 0: ask user enter file name
        System.out.print("Enter a file name: ");
        fileName = keyboard.nextLine();

        //step 1: create a connecter
        File myFile = new File(fileName);
        Scanner inputFile = new Scanner(myFile);

        //step 2: read the file
        while(inputFile.hasNext())
        {
            //read
            double data= inputFile.nextDouble();

            //display
            System.out.println(data);

            //calculate
            sum = sum+data;
         }
         System.out.println("The sum is " + sum);

        // step 3: close the connecter
        inputFile.close();
    }
}