package chapter7.inheritance;
/*Child-Class that inherits from Student class*/
public class PartTimeStudent extends Student {
    private boolean isEmployed;//unique attribute

    public PartTimeStudent(String stNum, String firstname, String lastname, String major, boolean employed){
        super(stNum,firstname, lastname, major);//constructor of the parent class
        this.isEmployed = employed;
    }

    public boolean getIsEmployed() {
        return isEmployed;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }

    @Override
    public void displayDetails(){
        System.out.println("Name: " + getFirstname() + " " + getLastname());
        System.out.println("Student Number: (" + getStudentNum() + ")");
        System.out.println("Major: " + getMajor());
        System.out.println("Is employed? " + getIsEmployed());
    }
}

