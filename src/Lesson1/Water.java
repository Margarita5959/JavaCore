package Lesson1;

    public class Water extends Obstacle {


        public Water(int length) {
            super(length);
        }

        @Override
        public void goChallenge(TeamMember member) {
            member.swimm(super.getLength());
        }

        @Override
        public void doIt(TeamMember members) {

        }
    }


