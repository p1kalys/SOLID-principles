class Room {
    String name;
    Room(String name) {
        this.name = name;
    }
}

class House {
    private Room livingRoom;
    private Room kitchen;

    House() {
        livingRoom = new Room("Living Room");
        kitchen = new Room("Kitchen");
    }

    void showHouse() {
        System.out.println("House contains " + livingRoom.name + " and " + kitchen.name);
    }
}

public class Composition {
    public static void main(String[] args) {
        House house = new House();
        house.showHouse(); // Output: House contains Living Room and Kitchen
    }
}