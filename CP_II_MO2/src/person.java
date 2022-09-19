public class person
{
    private String IDNum;
    private String firstName;
    private String lastName;
    private int YOB;

    public person(String IDNum, String firstName, String lastName, int YOB) {
        this.IDNum = IDNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.YOB = YOB;
    }

    public String getIDNum() {
        return IDNum;
    }

    public void setIDNum(String IDNum) {
        this.IDNum = IDNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }
}
