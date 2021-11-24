package Lesson1;

public class Team {
    private TeamMember[] members;
    private final String nameTeam;

    public Team(String nameTeam, TeamMember... members) {
        this.members = members;
        this.nameTeam = nameTeam;
    }

    public void showResults() {
        printDivider();
        System.out.println("Полосу препятствий прошла команда: " + nameTeam);
        for (TeamMember member:members) {
            if (member.getStatus()== Status.NoPassedDistance){
                showResultMemberNoPassed(member);
            }
            else {
                showResultMemberPassed(member);
            }
        }
        printDivider();
    }

    private void showResultMemberNoPassed(TeamMember member) {
        printDivider();
        System.out.println(member.getNameTeamMember() + " Не справился с полосой препятствий");
    }

    private void showResultMemberPassed(TeamMember member) {
        printDivider();
        System.out.println(member.getNameTeamMember() + " Справился с полосой препятствий");
    }

    public TeamMember[] getMembers() {
        return members;
    }

    private void printDivider() {
        System.out.println("-----------------------------------------------------------");
    }
}