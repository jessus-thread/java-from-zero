package AttributeStatic;

public class Classroom {
    private String studentName; // Instance attribute

   /*
        Static attributes belong to the class and not to the object created
        from it. Therefore, all instances share the same value of these
        attributes and there is only one copy of them in the entire class.

        When you use the word "new", Java goes to a memory space called
        "Heap" and builds a new House (an object) based on your blueprint
        (the class)

        Design Patterns (Singleton): when you need to ensure that only a
        single connection to your database (for example, to MongoDB) exists
        in the entire application, you save that connection in a static
        variable
    */
    private static String schoolName = "School Technical Number 1"; // class attribute

    public Classroom(String studentName) {
        this.studentName = studentName;
    }

    public void showInfo() {
        System.out.println("Student name: " + this.studentName);
        System.out.println("School name: " + Classroom.schoolName);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        Classroom.schoolName = schoolName;
    }
}
