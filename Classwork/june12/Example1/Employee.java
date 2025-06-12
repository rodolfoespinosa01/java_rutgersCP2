
public class Employee extends Person
{
   private String pos;
   private double sal;
   
   public Employee()
   {
      super();
      pos= "";
      sal = 0.0;
      
   }
   public Employee(String name, int age, String pos, double sal)
   {
      super(name,age);
      this.pos = pos;
      this.sal = sal;
   }
   public void setPos(String pos)
   {
      this.pos = pos;
   }
   public void setSal(double sal)
   {
      this.sal = sal;
   }
   public String getPos()
   {
      return pos;
   }
   public double getSal()
   {
      return sal;
   }
   public String toString()
   {
      String str;
      str = "The name is " + getName() + 
      " and the age is " + getAge()+
      "position is " + pos+
      "salary is " +sal
      ;
      return str;
   }
   

}