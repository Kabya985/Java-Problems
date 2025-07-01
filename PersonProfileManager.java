public class Person {
    // Attributes
    String name;
    int age;

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age
    public void displayInfo() {
        System.out.println(name + " is " + age + " years old.");
    }

    // Method to update name and age
    public void updateInfo(String newName, int newAge) {
        this.name = newName;
        this.age = newAge;
    }

    public static void main(String[] args) {
        // Create two Person objects
        Person person1 = new Person("Ean Craig", 11);
        Person person2 = new Person("Evan Ross", 12);

        // Print initial information
        person1.displayInfo();
        person2.displayInfo();

        // Update information
        person1.updateInfo("Ean Craig", 14);
        person2.updateInfo("Lewis Jordan", 12);

        // Print updated information
        System.out.println("Set new age and name:");
        System.out.println(person1.name + " is now " + person1.age + " years old.");
        System.out.println(person2.name + " is now " + person2.age + " years old.");
    }
}
