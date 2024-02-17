 // "is a" relationship
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + " makes a sound");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " barks");
    }
}

// "has a" relationship
class Person {
    private String name;
    private Animal pet;

    public Person(String name) {
        this.name = name;
    }

    public void adoptPet(Animal pet) {
        this.pet = pet;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ".");
        if (pet != null) {
            System.out.println("I have a pet named " + pet.name + ".");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        Person person = new Person("John");

        person.adoptPet(dog);

        person.introduce();
        ((Dog) person.pet).bark();
    }
}
