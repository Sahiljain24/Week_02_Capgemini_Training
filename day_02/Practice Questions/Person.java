public class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor (clones another Person's attributes)
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display person details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to test the Person class
    public static void main(String[] args) {
        Person person1 = new Person("John", 30);
        System.out.println("Original Person:");
        person1.display();

        // Creating a new Person using the copy constructor
        Person person2 = new Person(person1);
        System.out.println("\nCopied Person:");
        person2.display();
    }
}
