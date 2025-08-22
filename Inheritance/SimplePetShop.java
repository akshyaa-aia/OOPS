import java.util.Scanner;

// Abstract class (Pet)
abstract class Pet {
    String name;

    Pet(String name) {
        this.name = name;
    }

    abstract void sound();  // Abstract method

    void display() {
        System.out.println("Pet Name: " + name);
    }
}

// Single Inheritance: Dog inherits from Pet
class Dog extends Pet {
    Dog(String name) {
        super(name);
    }

    void sound() {
        System.out.println(name + " says: Woof!");
    }

    void fetch() {
        System.out.println(name + " is fetching a stick!");
    }
}

// Hierarchical Inheritance: Cat inherits from Pet
class Cat extends Pet {
    Cat(String name) {
        super(name);
    }

    void sound() {
        System.out.println(name + " says: Meow!");
    }

    void scratch() {
        System.out.println(name + " is scratching the carpet!");
    }
}

public class SimplePetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Pet Shop!");
        System.out.print("Choose a pet (dog / cat): ");
        String choice = scanner.nextLine().toLowerCase();

        Pet myPet;

        if (choice.equals("dog")) {
            myPet = new Dog("Buddy");
        } else if (choice.equals("cat")) {
            myPet = new Cat("Whiskers");
        } else {
            System.out.println("Invalid choice. Defaulting to dog.");
            myPet = new Dog("Buddy");
        }

        System.out.println("\n--- Pet Details ---");
        myPet.display();
        myPet.sound();

        // Specific behaviors
        if (myPet instanceof Dog dog) {
            dog.fetch();
        }

        if (myPet instanceof Cat cat) {
            cat.scratch();
        }

        scanner.close();
    }
}
