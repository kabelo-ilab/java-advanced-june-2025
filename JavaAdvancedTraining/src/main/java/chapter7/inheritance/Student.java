package chapter7.inheritance;
/*Parent-Class with common attributes for part-time and
* full-time students*/
public class Student {
    private String studentNum;
    private String firstname;
    private String lastname;
    private String major;

    public Student(String studentNum, String firstname, String lastname, String major) {
        this.studentNum = studentNum;
        this.firstname = firstname;
        this.lastname = lastname;
        this.major = major;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void displayDetails(){
        System.out.println("Name: " + getFirstname() + " " + getLastname());
        System.out.println("Student Number: (" + getStudentNum() + ")");
        System.out.println("Major: " + getMajor());
    }
}
