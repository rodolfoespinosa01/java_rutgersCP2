
import java.util.*;
import java.io.*;

public class FileNotFoundDemo
{
   public static void main(String[] args) 
   {
      Scanner keyboard = new Scanner(System.in);
      File file;
      Scanner inputFile;
      String fileName;
      
      try
      {
         System.out.print("Enter the file name: ");
         fileName = keyboard.nextLine();
         
         file = new File(fileName);
         
         if(!file.exists())
         {
            throw new FileNotFoundException();
         }
         
      
      
      }
      catch(FileNotFoundException e)
      {
            System.out.println("File not found");
      }
      catch(IOException e)
      {
         System.out.println("An error occured");
      }
   
   
   }
}