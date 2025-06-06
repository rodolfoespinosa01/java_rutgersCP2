import java.util.Scanner;
public class PassArray
{
   public static void main(String [] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int[] numbers = new int[7];
      int x;
      
      for (int index=0; index < numbers.length; index++)
      {
         System.out.print("Enter number " + (index+1) + ": ");
         numbers[index] = keyboard.nextInt();
      }
      
      x = addition(numbers);
      
      System.out.println("Sum is " + x);
   }
   public static int addition(int [] n)
   {
      int sum=0;
      for (int index = 0; index < n.length; index++)
      {
         sum = sum + n[index];
      }
      return sum;
   }
}