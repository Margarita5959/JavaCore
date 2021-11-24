package Lesson1;

public class Cross extends Obstacle {

    public Cross(int length) {
        super(length);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.run(super.getLength());
    }

    @Override
    public void doIt(TeamMember members) {

    }

}