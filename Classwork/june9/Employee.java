public class Employee
{
   private String name;
   private int age;
   private double salary;
   private Address address;
   
   public Employee()
   {
      name = "";
      age = 0;
      salary = 0.0;
      address = null;
   }
   
   public Employee(String name, int age, double salary)
   {
      this.name = name;
      this.age = age;
      this.salary = salary;
      this.address = null;
   }
   
   public void setName(String name)
   {
      this.name = name;
   }
   
   public void setAge(int age)
   {
      this.age = age;
   }
   public void setSalary(double salary)
   {
      this.salary = salary;
   }
   
   public String getName()
   {
      return name;
   }
   
   public int getAge()
   {
      return age;
   }
   public double getSalary()
   {
      return salary;
   }
   
   public String toString()
   {
      String str;
      str = "The name is " + name + "The age is: " + age + "The salary is: " + salary;
      return str;
   }
}