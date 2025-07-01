public class Dog {
    // Attributes
    private String name;
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for breed
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for breed
    public String getBreed() {
        return breed;
    }

    public static void main(String[] args) {
        // Create two Dog objects using constructor
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Charlie", "Bulldog");

        // Print initial values
        System.out.println(dog1.getName() + " is a " + dog1.getBreed() + ".");
        System.out.println(dog2.getName() + " is a " + dog2.getBreed() + ".");

        // Modify attributes using setters
        dog1.setBreed("Labrador Retriever");
        dog2.setName("Daisy");

        // Print updated values
        System.out.println("Set the new Breed of dog1 and new name of dog2:");
        System.out.println(dog1.getName() + " is now a " + dog1.getBreed() + ".");
        System.out.println(dog2.getName() + " is now a " + dog2.getBreed() + ".");
    }
}