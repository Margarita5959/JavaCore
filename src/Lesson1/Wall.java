package Lesson1;


    public class Wall extends Obstacle {


        public Wall(int length) {
            super(length);
        }

        @Override
        public void doIt(TeamMember members) {
            members.jump(super.getLength());
        }
    }

