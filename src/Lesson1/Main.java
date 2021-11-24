package Lesson1;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("Winners",
                new TeamMember ("Ron", 30, 2, 27),
                new TeamMember ("Harry", 27, 3, 15),
                new TeamMember ("Hermiona", 29, 4, 20),
                new TeamMember ("Hagrid", 30, 5, 30));

        Course c = new Course(new Obstacle[] {
                new Cross(25),
                new Wall(2),
                new Water(17)
        });


        c.doIt(team);
        team.showResults();

    }
}




