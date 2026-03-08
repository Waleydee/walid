// Ibrahim ABDULLAH
// 445820346
public class Student {

    // Data members
    String studentName;
    int studentId;
    String grade;
    double marks;

    // Method to display student details
    void displayDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Grade: " + grade);
        System.out.println("Marks: " + marks);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {

        // First student object
        Student s1 = new Student();
        s1.studentName = "IBRAHIM ABDULLAH";
        s1.studentId = 445820346;
        s1.grade = "A";
        s1.marks = 90.5;

        // Second student object
        Student s2 = new Student();
        s2.studentName = "Ibrahim Abdullah";
        s2.studentId = 102;
        s2.grade = "B";
        s2.marks = 80.0;

        // Display student details
        s1.displayDetails();
        s2.displayDetails();
    }
}