package Solved.SRP;

import java.util.ArrayList;
import java.util.List;

public class ItemRepository {

    private List<Item> items = new ArrayList<>();

    // Save item to in-memory list
    public void save(Item item) {
        items.add(item);
    }

    // Update item in in-memory list
    public void update(Item item) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equals(item.getName())) {
                items.set(i, item);
                return;
            }
        }
        throw new IllegalArgumentException("Item not found.");
    }

    // Delete item from in-memory list
    public void delete(String itemName) {
        items.removeIf(item -> item.getName().equals(itemName));
    }

    // Get all items
    public List<Item> getItems() {
        return items;
    }
}
