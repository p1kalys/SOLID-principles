class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }

    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
}

class Lion extends Animal {
    void roar() {
        System.out.println("Lion is roaring");
    }

    @Override
    void eat() {
        System.out.println("Lion is eating");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); // Output: Dog is eating
        myDog.bark(); // Output: Dog is barking

        Lion myLion = new Lion();
        myLion.eat(); // Output: Lion is eating
        myLion.roar(); // Output: Lion is roaring
    }
}
