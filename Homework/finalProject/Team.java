// Requirement (h): Aggregation
// The Team class contains Athlete objects, but is not a subclass

import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Athlete> members; // Aggregation: a team HAS-A list of Athletes

    // Constructor
    public Team(String teamName) {
        this.teamName = teamName;
        members = new ArrayList<Athlete>(); // initialize the list
    }

    // Add an athlete to the team
    public void addMember(Athlete athlete) {
        members.add(athlete);
    }

    // Display all team members
    public void showTeam() {
        System.out.println("Team: " + teamName);
        for (Athlete a : members) {
            System.out.println("- " + a.toString()); // calls overridden toString if subclassed
        }
    }

    // Get total number of athletes on the team
    public int getTeamSize() {
        return members.size();
    }
}
