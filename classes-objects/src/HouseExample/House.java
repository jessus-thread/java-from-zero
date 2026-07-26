package HouseExample;

public class House {
    int doors;
    int windows;
    double size;

    void openDoor() {
        System.out.println("Open door");
    }

    double calculateArea() {
        return size * size;
    }
}
