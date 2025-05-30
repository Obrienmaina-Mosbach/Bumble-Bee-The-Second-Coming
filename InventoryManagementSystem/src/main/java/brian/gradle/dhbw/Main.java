package brian.gradle.dhbw;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to our Inventory Management Company!");


        // Setup

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();

        // Setup Categories
        Category snacks = new Category(1, "Books");
        Category drinks = new Category(2, "Tech");

        while (true) {
            System.out.println("\n========Inventory Menu==========");
            System.out.println("1. Add Product");
            System.out.println("2. Display Inventory");
            System.out.println("3. Restock Inventory");
            System.out.println("4.Sell Product");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int id = 1000 + random.nextInt(9000); // Generate random ID between 1000-9999
                    System.out.println("Generated Product ID: " + id);
                    System.out.println("Enter product name: ");
                    String productName = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Enter product price: ");
                    double price = scanner.nextDouble();
                    System.out.println("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Category: ");
                    String categoryName = scanner.nextLine();

                    System.out.println("Product added");
            }
        }
    }
}