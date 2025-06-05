import java.util.Scanner;

public class RectangleDemo {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int myLength, myWidth;

        System.out.print("Enter length: ");
        myLength = keyboard.nextInt();

        System.out.print("Enter width: ");
        myWidth = keyboard.nextInt();

        Rectangle r1 = new Rectangle(myLength, myWidth);
        System.out.println(r1.toString());
    }

    
}
