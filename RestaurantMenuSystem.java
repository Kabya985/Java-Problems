import java.util.*;

class Restaurant {
    // Menu item name → price
    private Map<String, Double> menu;
    // List of ratings
    private List<Double> ratings;

    public Restaurant() {
        menu = new LinkedHashMap<>(); // keeps insertion order
        ratings = new ArrayList<>();
    }

    // Add item to menu
    public void addItem(String itemName, double price) {
        menu.put(itemName, price);
    }

    // Remove item from menu
    public void removeItem(String itemName) {
        menu.remove(itemName);
    }

    // Add a rating
    public void addRating(double rating) {
        ratings.add(rating);
    }

    // Calculate average rating
    public double calculateAverageRating() {
        if (ratings.isEmpty()) return 0.0;

        double total = 0.0;
        for (double r : ratings) {
            total += r;
        }
        return total / ratings.size();
    }

    // Display menu
    public void displayMenu() {
        System.out.println("Menu:");
        for (String item : menu.keySet()) {
            System.out.println(item + ": $" + menu.get(item));
        }
    }
}

public class RestaurantApp {
    public static void main(String[] args) {
        // Create restaurant object
        Restaurant restaurant = new Restaurant();

        // Add items
        restaurant.addItem("Burger", 8.99);
        restaurant.addItem("Pizza", 10.99);
        restaurant.addItem("Salad", 6.00);

        // Add ratings
        restaurant.addRating(5.0);
        restaurant.addRating(4.5);
        restaurant.addRating(4.5);

        // Display initial menu
        restaurant.displayMenu();

        // Show average rating
        System.out.println("Average rating: " + restaurant.calculateAverageRating());

        // Remove Pizza
        System.out.println("\nRemove 'Pizza' from the above menu.");

        restaurant.removeItem("Pizza");

        // Display updated menu
        System.out.println("\nUpdated menu:");
        restaurant.displayMenu();
    }
}