import java.util.Scanner;

public class PersonDemo
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      String name;
      int age;

      System.out.print("Enter name: ");
      name = keyboard.nextLine();

      System.out.print("Enter age: ");
      age = keyboard.nextInt();
      
      
      Person p1 = new Person(name, age);
      System.out.println(p1.toString());
   }
}