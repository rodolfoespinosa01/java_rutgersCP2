public class Dog extends Animal
{
    public void makeSound(boolean injured)
    {
        if(injured)
        {
            System.out.println("Whimper");
        }
    }
    
    public void makeSound()
    {
        System.out.println("Wroof");
    }
    
    public String toString()
    {
        String str = "Hello Dog";
        return str;
    }

}