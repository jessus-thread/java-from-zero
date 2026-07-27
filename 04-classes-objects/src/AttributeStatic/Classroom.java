package AttributeStatic;

public class Classroom {
    private String studentName; // Atributo de instancia

    /*
     * Los atributos estáticos pertenecen a la clase y no a los objetos creados a partir de ella.
     * Por eso, todas las instancias comparten el mismo valor de estos atributos y solo existe
     * una copia de ellos en toda la clase.
     */
    private static String schoolName = "School Technical Number 1"; // Atributo de clase

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
