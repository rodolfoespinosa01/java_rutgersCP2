import java.util.Scanner;
import java.io.*;

public class UppercaseFileConverter
{
    public static void main(String[] args) throws IOException
    {
        Scanner keyboard = new Scanner(System.in);
        String inputFileName, outputFileName;

        // step 1: Get input file name
        System.out.print("Enter the name of the input file: ");
        inputFileName = keyboard.nextLine();

        // step 2: Get output file name
        System.out.print("Enter the name of the output file: ");
        outputFileName = keyboard.nextLine();

        // step 3: Open input file for reading
        File inputFile = new File(inputFileName);
        Scanner inputFileScanner = new Scanner(inputFile);

        // step 4: Open output file for writing
        PrintWriter outputFile = new PrintWriter(outputFileName);

        // step 5: Read lines, convert to uppercase, and write to output
        while (inputFileScanner.hasNextLine())
        {
            String line = inputFileScanner.nextLine();
            outputFile.println(line.toUpperCase());
        }

        // step 6: Close files
        inputFileScanner.close();
        outputFile.close();

        System.out.println("File has been converted to uppercase and saved as " + outputFileName);
    }
}
