package chapter7;
/*Student Class using an overloaded constructor*/
public class Student {
    String studentNum;
    String firstname;
    String lastname;
    String major;

    //Overloaded / Parameterized constructor
    public Student(String stNum, String firstname, String lastname, String major){
        this.studentNum = stNum;
        this.firstname = firstname;
        this.lastname = lastname;
        this.major = major;
    }

    void displayDetails(){
        System.out.println("Name: " + this.firstname + " " + this.lastname);
        System.out.println("Student Number: (" + this.studentNum + ")");
        System.out.println("Major: " + this.major);
    }
}
