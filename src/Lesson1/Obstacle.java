package Lesson1;


    public abstract class Obstacle {
        private int length;
        private int heigth;

        public Obstacle (int length) {
            this.length = length;
        }



        public int getLength() {
            return length;

        }
        public void goChallenge (TeamMember member){}


        public abstract void doIt(TeamMember members);
    }

