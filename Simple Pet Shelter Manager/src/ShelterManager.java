import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShelterManager {
    // Polymorphism in action: This list can hold Dog AND Cat objects!
    private static List<Pet> shelter = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


        public static void main(String[] args) {
            // START of the infinite loop
            while (true) {
                displayMenu();
                // You need to add code here to read the choice:
                // int choice = scanner.nextInt();

                // FOR TESTING ONLY (You should remove this part later):
                shelter.add(new Dog("Fido", 3, "Labrador"));
                shelter.add(new Cat("Mittens", 5, true));
                for (Pet p : shelter) {
                    System.out.println(p);
                    p.makeSound();
                }

                // To make the program stop while testing the display:
                break; // Use 'break;' instead of 'return;' to cleanly exit the loop

                // You should have a way to exit the program based on user choice (e.g., case 3)
            }
            // Inside your while (true) loop:
            displayMenu();

// 1. Read the user's choice (Need to handle the possibility of non-integer input)
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

// 2. Decide what to do
            switch (choice) {
                case 1:
                    // You will call your addBook() or addPet() method here
                    System.out.println("Add Pet logic goes here...");
                    break;
                case 2:
                    // You will call your viewBooks() or viewPets() method here
                    System.out.println("View Pets logic goes here...");
                    break;
                case 3:
                    System.out.println("Goodbye! Shutting down.");
                    scanner.close(); // Close the scanner when exiting
                    return; // This exits the main method, stopping the program
                default:
                    System.out.println("Invalid choice. Please pick a number from the menu.");
            }
            // The program will continue here after the 'break;'
        }}