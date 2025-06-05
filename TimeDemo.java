import java.util.Scanner;

public class TimeDemo {
    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        int myHours, myMinutes, mySeconds;

        System.out.print("Enter hours: ");
        myHours = keyboard.nextInt();

        System.out.print("Enter minutes: ");
        myMinutes = keyboard.nextInt();

        System.out.print("Enter seconds: ");
        mySeconds = keyboard.nextInt();


        /* 
        Time t1 = new Time();
        System.out.println(t1.toString());

        t1.setHours(11);
        t1.setMinutes(30);

        //updated
        System.out.println("Updated Time");
        System.out.println("Hours: " + t1.getHours());
        System.out.println("Minutes: " + t1.getMinutes());
        System.out.println("Seconds: " + t1.getSeconds());

        Time t2 = new Time(10, 30, 50);
        System.out.println("T2 is ");
        System.out.println(t2.toString());
        */
    }
}
