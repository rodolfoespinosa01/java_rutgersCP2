import java.util.*;

public class TestMetric
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        double miles, kilos;

        System.out.print("Enter a distance in miles: ");
        miles = keyboard.nextDouble();

        kilos = Metric.milesToKilometers(miles);

        System.out.print("The distance in kilometers is: " + kilos);
    }
}