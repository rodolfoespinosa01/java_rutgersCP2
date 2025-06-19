// This is the superclass 
// Superclass with data members, accessors, mutators, and toString

public class Athlete {
    // Static member to count total athletes created
    // requirement - static member
    private static int athleteCount = 0;

    private String name;
    private int age;
    private String sport;

    // Constructor
    public Athlete(String name, int age, String sport) {
        this.name = name;
        this.age = age;
        this.sport = sport;
        athleteCount++; // increment the static counter
    }

    // Accessors (getters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSport() {
        return sport;
    }

    // Mutators (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    // Static method to get total athletes
    public static int getAthleteCount() {
        return athleteCount;
    }

    // toString method (will be overridden later)
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Sport: " + sport;
    }
}
