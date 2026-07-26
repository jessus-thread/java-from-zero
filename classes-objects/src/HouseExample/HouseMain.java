package HouseExample;

public class HouseMain {
    public static void main(String[] args) {
        House firstHouse = new House();
        House secondHouse = new House();

        firstHouse.doors = 3;
        firstHouse.windows = 5;
        firstHouse.size = 10;

        secondHouse.doors = 3;
        secondHouse.windows = 3;
        secondHouse.size = 20;

        firstHouse.openDoor();
        secondHouse.openDoor();

        System.out.println("Area of first house: " + firstHouse.calculateArea());
        System.out.println("Area of second house: " + secondHouse.calculateArea());
    }
}
