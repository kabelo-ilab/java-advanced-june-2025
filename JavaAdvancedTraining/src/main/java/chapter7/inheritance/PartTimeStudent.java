package chapter7.inheritance;

/**
 * @author Kabelo Tlhape
 * The type Part time student.
 * Child-Class that inherits from Student class
 */

public class PartTimeStudent extends Student {
    private boolean isEmployed;//unique attribute

    /**
     * Instantiates a new Part time student.
     *
     * @param stNum     the student number
     * @param firstname the firstname
     * @param lastname  the lastname
     * @param major     the major
     * @param employed  is employed?
     */
    public PartTimeStudent(String stNum, String firstname, String lastname, String major, boolean employed){
        super(stNum,firstname, lastname, major);//constructor of the parent class
        setEmployed(employed);
    }

    /**
     * Gets is employed.
     *
     * @return the is employed
     */
    public boolean getIsEmployed() {
        return isEmployed;
    }

    /**
     * Sets employed.
     *
     * @param employed the employed
     */
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

