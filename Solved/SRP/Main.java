package Solved.SRP;

public class Main {

    public static void main(String[] args) {
        // Instantiate the dependencies
        ItemValidator itemValidator = new ItemValidator();
        ItemLogger itemLogger = new ItemLogger();
        ItemRepository itemRepository = new ItemRepository();

        // Instantiate SRP class (business logic)
        SRP srp = new SRP(itemValidator, itemLogger, itemRepository);

        // Create an item
        Item item = new Item("Laptop", 1000);
        srp.createItem(item);  // This will validate, log, and persist the item

        // Update the item
        item.setPrice(900);
        srp.updateItem(item);  // This will validate, log, and update the item

        // Delete the item
        srp.deleteItem("Laptop");  // This will log and delete the item

        // Display all items in memory
        srp.displayItems();  // This will show any remaining items
    }
}
