public class Cube extends Rectangle implements Shapes
{
    private double height;

    public Cube()
    {
        super();
        this.height = 0.0;
    }

    public Cube(double length, double width, double height)
    {
        super(length, width);
        this.height = height;
    }
    public void setHeight(double height)
    {
        this.length = height;
    }
    public void getHeight(double height)
    {
        this.length = height;
    }

    public void draw()
    {
        System.out.println("Drawing a cube");
    }
    
    public void cut()
    {
        System.out.println("Cutting a cube");
    }
    
    public void color()
    {
        System.out.println("Coloring a cube");
    }

    public double getVolume()
    {
        return getArea() * height;
    }

    public String toString()
    {
        String str = "Length is " + getlength()
        + "Width is " + getWidth()
        + "Volume is " + getVolume();
    }

}