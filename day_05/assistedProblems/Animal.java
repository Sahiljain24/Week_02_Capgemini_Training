package day_05.assistedProblems;
/*Assisted Problems
Animal Hierarchy
Description: Create a hierarchy where Animal is the superclass, and Dog, Cat, and Bird are subclasses. Each subclass has a unique behavior.
Tasks:
Define a superclass Animal with attributes name and age, and a method makeSound().
Define subclasses Dog, Cat, and Bird, each with a unique implementation of makeSound().
Goal: Learn basic inheritance, method overriding, and polymorphism with simple classes.
 */
// Superclass: Animal
public class Animal {
    String name;
    int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden by subclasses
    void makeSound() {
        System.out.println(name + " makes a sound in animal class.");
    }
}

// Subclass: Dog
class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age); // Call the superclass constructor
    }

    // Overriding makeSound() method
    @Override
    void makeSound() {
        System.out.println(name + " is barking in dog class");
    }
}

// Subclass: Cat
class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age); // Call the superclass constructor
    }

    // Overriding makeSound() method
    @Override
    void makeSound() {
        System.out.println(name + " cat is meowing in cat class");
    }
}

// Subclass: Bird
class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age); // Call the superclass constructor
    }

    // Overriding makeSound() method
    @Override
    void makeSound() {
        System.out.println(name + " bird is chirping in bird class");
    }
}

// Main Class
 class AnimalMain {
    public static void main(String[] args) {
        // Polymorphism: Animal reference for different subclasses
        Animal dog = new Dog("Arnav", 3);
        Animal cat = new Cat("Adarsh", 2);
        Animal bird = new Bird("Sahil", 1);

        // Method overriding in action
        dog.makeSound();  // Calls Dog's makeSound()
        cat.makeSound();  // Calls Cat's makeSound()
        bird.makeSound(); // Calls Bird's makeSound()
    }
}
