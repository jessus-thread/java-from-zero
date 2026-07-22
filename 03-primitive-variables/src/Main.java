public class Main {
    public static void main(String[] args) {
        byte age = 23;

        System.out.println("age = " + age);

        /*
            As you can see, the letter F is being placed at the end of the number.

            This indicates that it is of type float, but it doesn't cause an error when assigned to a
            variable of type double because the conversion is implicit.
         */
        double price = 19.99F;
        int xAxis, yAxis;

        xAxis = 10;
        yAxis = 20;
        age = 30;

        System.out.println("age = " + age);
        System.out.println("xAxis = " + xAxis);
        System.out.println("yAxis = " + yAxis);

        char initial = 'G';
        boolean isTeacher = true;

        System.out.println("initial = " + initial);
        System.out.println("isTeacher = " + isTeacher);
    }
}
