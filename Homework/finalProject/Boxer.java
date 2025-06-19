// Subclass of Athlete (Requirement b)
// Implements Trainable interface (Requirement c)
// Method Overloading: setStats()
// Method Overriding (without using @Override)

public class Boxer extends Athlete implements Trainable {
    private String weightClass;
    private int wins;
    private int losses;

    // Constructor
    public Boxer(String name, int age, String weightClass, int wins, int losses) {
        super(name, age, "Boxing"); // sets the sport to "Boxing"
        this.weightClass = weightClass;
        this.wins = wins;
        this.losses = losses;
    }

    // Accessor methods
    public String getWeightClass() {
        return weightClass;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    // Mutator methods
    public void setWeightClass(String weightClass) {
        this.weightClass = weightClass;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    // Method Overloading: two versions of setStats()
    public void setStats(int wins, int losses) {
        this.wins = wins;
        this.losses = losses;
    }

    public void setStats(String weightClass, int wins, int losses) {
        this.weightClass = weightClass;
        this.wins = wins;
        this.losses = losses;
    }

    // Overriding toString method (no @Override used)
    public String toString() {
        return super.toString() + ", Weight Class: " + weightClass +
               ", Wins: " + wins + ", Losses: " + losses;
    }

    // Implementing interface methods (no @Override used)
    public void train() {
        System.out.println(getName() + " is training hard for the next fight.");
    }

    public void compete() {
        System.out.println(getName() + " is competing in a boxing match.");
    }
}
