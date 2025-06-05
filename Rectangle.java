public class Rectangle {
    private int length;
    private int width;

    public Rectangle()
    {
        length = 0;
        width = 0;
    }

    public Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    public void setLength(int l)
    {
        this.length = l;
    }
    public void setwidth(int w)
    {
        this.width = w;
    }
    public String toString()
    {
        return "This rectangle length is " + length + " and width is " + width;
    }
}
