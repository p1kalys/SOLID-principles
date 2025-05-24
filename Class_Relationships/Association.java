class Car {
    String model;

    Car(String model) {
        this.model = model;
    }

    void drive() {
        System.out.println("Driving a " + model);
    }
}

class Person {
    String name;
    Car car;

    Person(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    void driveCar() {
        System.out.println(name + " is driving a car.");
        car.drive();
    }
}

public class Association {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla Model S");
        Person person = new Person("Alice", myCar);
        
        person.driveCar(); // Output: Alice is driving a car. Driving a Toyota
    }
}