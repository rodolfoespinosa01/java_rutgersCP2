public class Rectangle 
{
    private double length;
    private double width;

    public Rectangle()
    {
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public void setLength(double l)
    {
        this.length = l;
    }
    public void setwidth(double w)
    {
        this.width = w;
    }
    public double getArea()
    {
        return length * width;
    }
    public String toString()
    {
        return "This rectangle length is " + length + " and width is " + width;
    }
}
