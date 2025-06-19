// ✅ This main program demonstrates all the required features

public class SportsDemo {
    public static void main(String[] args) {
        // Polymorphism: using superclass reference to subclass object
        Athlete a1 = new Boxer("Rodolfo Espinosa", 33, "Heavyweight", 18, 0);
        Athlete a2 = new Boxer("Maya Torres", 24, "Featherweight", 12, 1);

        // Interface methods called through actual object
        Trainable b1 = (Trainable) a1; // casting superclass reference to interface
        b1.train();
        b1.compete();

        // Overloaded method
        Boxer boxer2 = (Boxer) a2;
        boxer2.setStats("Featherweight", 13, 1); // update with overloaded setStats

        // Aggregation: create a team and add boxers
        Team boxingTeam = new Team("Elite Boxers");
        boxingTeam.addMember(a1);
        boxingTeam.addMember(a2);

        // Show team details (calls overridden toString method)
        boxingTeam.showTeam();

        // Static method usage
        System.out.println("\nTotal athletes created: " + Athlete.getAthleteCount());
    }
}
