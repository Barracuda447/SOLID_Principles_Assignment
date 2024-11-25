package Violated.SRP;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class SRP {

    private static final Logger logger = Logger.getLogger(SRP.class.getName());
    private List<Item> items = new ArrayList<>();

    // Creates an item, validates it, logs, and saves it
    public void createItem(Item item) {
        // Simple validation
        if (item == null || item.getName() == null || item.getPrice() <= 0) {
            throw new IllegalArgumentException("Invalid item data.");
        }

        // Logging (SRP violation because it is with the validation)
        logger.info("Creating item: " + item.getName());

        // Persisting (SRP violation because it is with the other 2)
        items.add(item);
    }

    // Updates an item, validates it, logs, and updates the list
    public void updateItem(Item item) {
        // Simple validation (SRP violation)
        if (item == null || item.getName() == null || item.getPrice() <= 0) {
            throw new IllegalArgumentException("Invalid item data.");
        }

        // Logging (SRP violation)
        logger.info("Updating item: " + item.getName());

        // Persisting (SRP violation)
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equals(item.getName())) {
                items.set(i, item);
                return;
            }
        }
        throw new IllegalArgumentException("Item not found.");
    }

    // Deletes an item by name, validates, logs, and removes it
    public void deleteItem(String itemName) {
        // Simple validation (SRP violation)
        if (itemName == null || itemName.isEmpty()) {
            throw new IllegalArgumentException("Invalid item name.");
        }

        // Logging (SRP violation)
        logger.info("Deleting item: " + itemName);

        // Persisting (SRP violation)
        items.removeIf(item -> item.getName().equals(itemName));
    }

    // Displays all items in memory (for testing)
    public void displayItems() {
        for (Item item : items) {
            System.out.println(item.getName() + ": " + item.getPrice());
        }
    }
}
