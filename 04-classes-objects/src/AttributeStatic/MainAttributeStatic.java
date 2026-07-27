package AttributeStatic;

public class MainAttributeStatic {
    /*
        The entry point of our app; this point must be unique, meaning that in my
        entire project only one class should have the main method
     */
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
