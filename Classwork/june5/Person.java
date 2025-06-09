public class Person
{
   private String name;
   private int age;
   
   public Person()
   {
      name = "";
      age = 0;
   }
   
   public Person(String name, int age)
   {
      this.name = name;
      this.age = age;
   }
   
   public void setName(String n)
   {
      this.name = n;
   }
   
   public void setAge(int a)
   {
      this.age = a;
   }
   
   public String getName()
   {
      return name;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public String toString()
   {
      String str;
      str = "The name is " + name + " and the age is " + age;
      return str;
   }
}

//name, age