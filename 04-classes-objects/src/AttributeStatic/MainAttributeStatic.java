package AttributeStatic;

public class MainAttributeStatic {
    public static void main(String[] args) {
        Classroom student1 = new Classroom("Jesus");
        Classroom student2 = new Classroom("Lucas");

        student1.showInfo();
        student2.showInfo();

        Classroom.setSchoolName("School Technical Number 2");

        student1.showInfo();
        student2.showInfo();


    }
}
