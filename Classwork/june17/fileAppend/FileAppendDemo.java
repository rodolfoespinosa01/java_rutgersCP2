import java.util.Scanner;
import java.io.*;

public class FileAppendDemo
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fWriter = new FileWriter("myfriends.txt", true);
        PrintWriter outputFile = new PrintWriter(fWriter);

        outputFile.println("John");
        outputFile.println("Bill");
        outputFile.println("Hector");

        //step3
        outputFile.close();

    }
}