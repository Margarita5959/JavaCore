package Lesson1;

public class TeamMember {
    private Status status = Status.NoPassedDistance;
    private String nameTeamMember;
    private int power;

    public TeamMember(String nameTeamMember, int i2, int i, int i1) {
        this.nameTeamMember = nameTeamMember;
        this.power = i2;
    }


    public Status getStatus() {
        return status;
    }

    public String getNameTeamMember() {
        return nameTeamMember;
    }

    public void jump(int courseLength){
        if (checkPower(courseLength)) {
            changeStatus(Status.PassedDistance," преодолел барьер");
        }
        else{
            changeStatus(Status.NoPassedDistance," не преодолел барьер");
        }
    }

    public void run(int courseLength) {
        if (checkPower(courseLength)) {
            changeStatus(Status.PassedDistance," пробежал кросс");
        }
        else{
            changeStatus(Status.NoPassedDistance,"  не пробежал кросс");
        }
    }

    public void swimm(int courseLength) {
        if (checkPower(courseLength)) {
            changeStatus(Status.PassedDistance," проплыл дистанцию");
        }
        else{
            changeStatus(Status.NoPassedDistance," не проплыл дистанцию");
        }
    }

    private boolean checkPower(int courseLength) {
        return power > courseLength || power == courseLength;
    }

    private void changeStatus(Status newStatus, String message) {
        status = newStatus;
        System.out.println(nameTeamMember + message);
    }

}