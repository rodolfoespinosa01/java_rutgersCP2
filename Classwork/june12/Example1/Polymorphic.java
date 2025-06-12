public class Polymorphic
{
    public static void main(String[] arg)
    {
        Person[] tests = new Person[3];

        tests[0] = new Person("Rodolfo", 33);
        tests[1] = new Employee("Alex", 30, "Manager", 50000);
        tests[2] = new Student("Tom", 20, "CS", 4.0);

        for(int i = 0; i < tests.length; i++)
        {
            System.out.println(tests[i]);
        }
    }
}