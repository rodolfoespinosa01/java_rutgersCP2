// interface with at least two abstract methods ➤ interface
interface BMRCalculator {
    double calculateBMR(); // ➤ abstract method 1
    String getSummary();   // ➤ abstract method 2
}

// abstract superclass with data members, accessors, mutators, toString ➤ abstract superclass
abstract class Person implements BMRCalculator {
    protected String name;
    protected int age;
    protected double weight; // in kg
    protected double height; // in cm

    public Person(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // ➤ accessors and mutators
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getWeight() { return weight; }
    public double getHeight() { return height; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setWeight(double weight) { this.weight = weight; }
    public void setHeight(double height) { this.height = height; }

    // ➤ toString method
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Weight: " + weight + "kg, Height: " + height + "cm";
    }
}

// subclass female ➤ subclass
class Female extends Person {
    public Female(String name, int age, double weight, double height) {
        super(name, age, weight, height);
    }

    // method overriding ➤ overriding
    @Override
    public double calculateBMR() {
        return (10 * weight) + (6.25 * height) - (5 * age) - 160;
    }

    @Override
    public String getSummary() {
        return toString() + ", BMR: " + calculateBMR();
    }
}

// subclass male ➤ subclass
class Male extends Person {
    public Male(String name, int age, double weight, double height) {
        super(name, age, weight, height);
    }

    // method overriding ➤ overriding
    @Override
    public double calculateBMR() {
        return (10 * weight) + (6.25 * height) - (5 * age) + 5;
    }

    @Override
    public String getSummary() {
        return toString() + ", BMR: " + calculateBMR();
    }
}

// class that uses aggregation ➤ aggregation
class BMREngine {
    private Person person; // ➤ person object is aggregated here

    public BMREngine(Person person) {
        this.person = person;
    }

    public void displayBMRReport() {
        System.out.println(person.getSummary());
    }

    // static method ➤ static
    public static void printTitle() {
        System.out.println("=== BMR Calculator ===");
    }

    // method overloading ➤ overloading
    public static double calculateCustomBMR(double weight, double height, int age, boolean isMale) {
        return (10 * weight) + (6.25 * height) - (5 * age) + (isMale ? 5 : -160);
    }
}

// main method to test ➤ main testing logic
public class BMRApp {
    public static void main(String[] args) {
        BMREngine.printTitle(); // ➤ call static method

        // ➤ polymorphism: superclass reference to subclass object
        Person femaleUser = new Female("Sara", 30, 60, 165);
        Person maleUser = new Male("John", 28, 75, 180);

        BMREngine femaleCalc = new BMREngine(femaleUser); // ➤ using aggregation
        BMREngine maleCalc = new BMREngine(maleUser);

        femaleCalc.displayBMRReport();
        maleCalc.displayBMRReport();

        // ➤ using overloaded method
        double customBMR = BMREngine.calculateCustomBMR(70, 175, 29, true);
        System.out.println("Custom BMR Calculation (Male): " + customBMR);
    }
}
