public class Person
{
   private String name;
   private int age;
   
   public Person()
   {
   name = null;
   age = 0;
   }
   
   public Person(String name, int age)
   {
      this.name = name;
      this.age = age;
   }
   
   public void setName(String name)
   { this.name = name;}
   
   public void setAge(int age)
   { this.age = age;}
   
   public String getName()
   { return name;}
   
   public int getAge()
   { return age;}
   
   
   public String toString()
   {
   String str = "Name is " + name + ", age is " + age;
   return str;
   }
   
   
   public static void main(String[] args)
   {
      Person p = new Person("John", 23);
      System.out.println(p.toString());
   }
}
