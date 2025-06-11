public class Student extends Person
{
    private String major;
    private double gpa;

    public Student()
    {
        super(); //must be the first statement
        major = "";
        gpa = 0.0;
    }
    public Student(String name, int age, String major, double gpa)
    {
        super(name, age);
        this.major = major;
        this.gpa = gpa;
    }
    public void setMajor(String major)
   {
      this.major = major;
   }
   public void setGpa(double gpa)
   {
      this.gpa = gpa;
   }
   public String getMajor()
   {
      return major;
   }
   
   public double getGpa()
   {
      return gpa;
   }
   public String toString()
   {
      String str = "Name is " + getName() + " and age is " + getAge() + " and major is " + major + " and GPA is " + gpa;
      return str;
   }
}