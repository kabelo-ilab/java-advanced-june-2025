package chapter7.inheritance;

/**
 * The type Student.
 */
/*Parent-Class with common attributes for part-time and
* full-time students*/
public class Student {
    private String studentNum;
    private String firstname;
    private String lastname;
    private String major;

    /**
     * Instantiates a new Student.
     *
     * @param studentNum the student num
     * @param firstname  the firstname
     * @param lastname   the lastname
     * @param major      the major
     */
    public Student(String studentNum, String firstname, String lastname, String major) {
        setStudentNum(studentNum);
        setFirstname(firstname);
        setLastname(lastname);
        setMajor(major);
    }

    /**
     * Gets student number.
     *
     * @return the student number as a {@code String}
     */
    public String getStudentNum() {
        return studentNum;
    }

    /**
     * Sets student number.
     *
     * @param studentNum the student number
     */
    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    /**
     * Gets firstname.
     *
     * @return the firstname as a {@code String}
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets firstname.
     *
     * @param firstname the firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Gets lastname.
     *
     * @return the lastname as a {@code String}
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets lastname.
     *
     * @param lastname the lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Gets major.
     *
     * @return the major as a {@code String}
     */
    public String getMajor() {
        return major;
    }

    /**
     * Sets major.
     *
     * @param major the major
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * Display student details.
     */
    public void displayDetails(){
        System.out.println("Name: " + getFirstname() + " " + getLastname());
        System.out.println("Student Number: (" + getStudentNum() + ")");
        System.out.println("Major: " + getMajor());
    }
}
