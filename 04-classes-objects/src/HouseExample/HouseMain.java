package HouseExample;

public class HouseMain {
    public static void main(String[] args) {
        House firstHouse = new House();
        House secondHouse = new House(3, 4, 20);

        /*
            Allowing direct access to a class's attributes is bad practice,
            as it violates the principle of encapsulation.

            firstHouse.doors = 3;
            firstHouse.windows = 5;
            firstHouse.size = 10;
        */

        firstHouse.setDoors(3);
        firstHouse.setWindows(5);
        firstHouse.setSize(10);

        firstHouse.openDoor();
        secondHouse.openDoor();

        System.out.println("Area of first house: " + firstHouse.calculateArea());
        System.out.println("Area of second house: " + secondHouse.calculateArea());
    }
}
