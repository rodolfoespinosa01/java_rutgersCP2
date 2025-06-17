

public class Metric
{
    public static double milesToKilometers(double miles)
    {
        double k = miles * 1.609;
        return k;
    }
    public static double kilometersToMiles(double kilo)
    {
        double m = kilo / 1.609;
        return m;
    }
}