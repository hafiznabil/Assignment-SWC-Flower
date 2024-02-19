
/**
 * program description: LabWork FlowerShop
 *
 * programmer: MUHAMMAD HAFIZ NABIL BIN ZAINI
 * Date: 19 February 2024
 */
import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Flower[] flowerInventory = new Flower[10];

        // Prompt user to enter data for each flower
        for (int i = 0; i < flowerInventory.length; i++) {
            System.out.println("Enter details for Flower #" + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Color: ");
            String color = scanner.nextLine();
            System.out.print("Price: $");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            flowerInventory[i] = new Flower(name, color, price, quantity);
        }

        // Display all flower details
        System.out.println("\nFlower Inventory:");
        for (Flower flower : flowerInventory) {
            System.out.println(flower);
        }

        // Calculate and display total value of the flower inventory
        double totalValue = 0.0;
        for (Flower flower : flowerInventory) {
            totalValue += flower.getPrice() * flower.getQuantity();
        }
        System.out.println("\nTotal Inventory Value: $" + totalValue);

        // Search for a flower by name
        System.out.print("\nEnter a flower name to search: ");
        String searchName = scanner.nextLine();
        for (Flower flower : flowerInventory) {
            if (flower.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Found flower:");
                System.out.println(flower);
                break;
            }
        }

        // Restock a specific flower
        System.out.print("\nEnter the index of the flower to restock (0-9): ");
        int index = scanner.nextInt();
        System.out.print("Enter the additional quantity: ");
        int additionalQuantity = scanner.nextInt();
        flowerInventory[index].setQuantity(flowerInventory[index].getQuantity() + additionalQuantity);

        // Display updated flower details
        System.out.println("\nUpdated Flower Inventory:");
        for (Flower flower : flowerInventory) {
            System.out.println(flower);
        }
    }
}