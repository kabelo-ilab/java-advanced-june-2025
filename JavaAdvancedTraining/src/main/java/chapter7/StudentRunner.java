package chapter7;

public class StudentRunner {
    public static void main(String[] args) {
        Student objStudent1 = new Student("ST12345", "Tom", "Smith", "Accounting");

        Student objStudent2 = new Student("ST24689", "Jessica", "Jones", "Programming");

        objStudent2.major = "SQL";

        objStudent1.displayDetails();
        System.out.println("=================================");
        objStudent2.displayDetails();

    }
}
