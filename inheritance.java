public class inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.sound();

        myDog.setBreed("Poodle");
        System.out.println("The breed of the " + myDog.getAnimalType() + " is " + myDog.getBreed());

    }
}

class Animal {
    private String animalType = "Dog";

    public void sound() {
        System.out.println("Woof Woof");
    }

    public String getAnimalType() {
        return animalType;
    }
}

class Dog extends Animal {
    private String dogBreed;

    public String setBreed(String breed) {
        dogBreed = breed;
        return dogBreed;
    }

    public String getBreed() {
        return dogBreed;
    }
}