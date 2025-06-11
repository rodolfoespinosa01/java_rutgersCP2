public class ProtectedDemo
{
    public static void main(String[] args)
    {
        Dictionary d = new Dictionary();
        System.out.println("Number of pages: " + d.getPages());
        System.out.println("Number of definitions: " + d.getDefinitions());
        System.out.println("Definitions per page: " + d.computeRatio());

    }
}