public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Aktos", "Dog", 3);
        Pet pet2 = new Pet("Murka", "Cat", 2);

        Adopter adopter1 = new Adopter("Alice", "alice@example.com");
        Adopter adopter2 = new Adopter("Aizat", "aizat@example.com");

        Shelter shelter = new Shelter("Happy Tails Shelter", "123 Main Street");

        System.out.println("Shelter Details:");
        System.out.println("Shelter [Name: " + shelter.getName() + ", Address: " + shelter.getAddress() + "]");

        System.out.println("\nPet Details:");
        System.out.println("Pet [Name: " + pet1.getName() + ", Species: " + pet1.getSpecies() + ", Age: " + pet1.getAge() + "]");
        System.out.println("Pet [Name: " + pet2.getName() + ", Species: " + pet2.getSpecies() + ", Age: " + pet2.getAge() + "]");

        System.out.println("\nAdopter Details:");
        System.out.println("Adopter [Name: " + adopter1.getName() + ", Contact Info: " + adopter1.getContactInfo() + "]");
        System.out.println("Adopter [Name: " + adopter2.getName() + ", Contact Info: " + adopter2.getContactInfo() + "]");

        System.out.println("\nComparing pets by age:");
        if (pet1.getAge() > pet2.getAge()) {
            System.out.println(pet1.getName() + " is older than " + pet2.getName());
        } else if (pet1.getAge() < pet2.getAge()) {
            System.out.println(pet2.getName() + " is older than " + pet1.getName());
        } else {
            System.out.println(pet1.getName() + " and " + pet2.getName() + " are the same age.");
        }
    }
}