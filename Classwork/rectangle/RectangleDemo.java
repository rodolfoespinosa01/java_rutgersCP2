public class RectangleDemo {
    public static void main(String[] args)
    {
        int area2, area3;

        Rectangle r2 = new Rectangle(10,5);
        Rectangle r3 = new Rectangle(25,2);

        if (r2.equals(r3))
        {
            System.out.println("Same");
            
        }
        else{
            System.out.println("Not Same");
        }
    }
}

// know difference between r2 == r3 and r2.equals(r3)
