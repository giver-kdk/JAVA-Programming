// Parent class
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("Animals make sounds");
    }
}

// Subclass 1
class Dog extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class Overriding {
    public static void main(String[] args) {
        // Parent class reference, parent class object
        Animal animal = new Animal();
        animal.sound();

        // Parent class reference, subclass object (Dog)
        Animal dog = new Dog();
        dog.sound();

        // Parent class reference, subclass object (Cat)
        Animal cat = new Cat();
        cat.sound();
    }
}
