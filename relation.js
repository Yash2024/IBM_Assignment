// "is a" relationship
class Animal {
    constructor(name) {
      this.name = name;
    }
  
    speak() {
      console.log(`${this.name} makes a sound`);
    }
  }
  
  class Dog extends Animal {
    constructor(name, breed) {
      super(name);
      this.breed = breed;
    }
  
    bark() {
      console.log(`${this.name} barks`);
    }
  }
  
  // "has a" relationship
  class Person {
    constructor(name) {
      this.name = name;
      this.pet = null;
    }
  
    adoptPet(pet) {
      this.pet = pet;
    }
  
    introduce() {
      console.log(`Hi, I'm ${this.name}.`);
      if (this.pet) {
        console.log(`I have a pet named ${this.pet.name}.`);
      }
    }
  }
  
  let dog = new Dog("Buddy", "Golden Retriever");
  let person = new Person("John");
  
  person.adoptPet(dog);
  
  person.introduce();
  person.pet.bark();
  