
public class Student extends Person
{
   private String major;
   private double gpa;
   
   public Student()
   {
      super();
      major = "";
      gpa = 0.0;
   }
   public Student(String name, int age, String major, double gpa)
   {
      super(name, age);
      this.major = major;
      this.gpa = gpa;
      System.out.print("Hello");
   }
   public void setMajor(String major)
   {  this.major = major;}
   public void setGpa(double gpa)
   {  this.gpa = gpa;}
   public String getMajor()
   {  return major;}
   public double getGpa()
   {  return gpa;}
   
   public String toString()
   {
      String str = "Name is " + getName()
                  +" age is " + getAge()
                  +" major is " + major
                  +" gpa is " + gpa;
       return str;
    }
   
   
}