public class Employee extends Person
{
   private double salary;
   private String position;
   
   public Employee()
   {
      super();
      salary = 0.0;
      position = null;
   }
   
   public Employee(String name, int age, double salary, String position)
   {
      super(name, age);
      this.salary = salary;
      this.position = position;
   }
   
   public void setSalary(double salary)
   {
      this.salary = salary;
   }
   public void setPosition(String position)
   {
      this.position = position;
   }
   
   public double getSalary()
   {
      return salary;
   }
   
   public String getPosition()
   {
      return position;
   }
   
   public String toString()
   {
      String str = "The name is " + getName() + ", the age is: " + getAge() + ", the salary is: " + salary + ", and the position is " + position + ".";
      return str;
   }
   public static void main(String[] args)
   {
      Employee e1 = new Employee ("John", 23, 60000.00, "Java Developer");
      System.out.println(e1.toString());
   }
}