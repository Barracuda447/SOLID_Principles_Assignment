package Solved.SRP;


public class SRP {

    private ItemValidator itemValidator;
    private ItemLogger itemLogger;
    private ItemRepository itemRepository;

    // Constructor to inject dependencies
    public SRP(ItemValidator itemValidator, ItemLogger itemLogger, ItemRepository itemRepository) {
        this.itemValidator = itemValidator;
        this.itemLogger = itemLogger;
        this.itemRepository = itemRepository;
    }

    // Business logic: Create an item
    public void createItem(Item item) {
        itemValidator.validate(item);           // Delegate validation
        itemLogger.logCreation(item);           // Delegate logging
        itemRepository.save(item);              // Delegate in-memory persistence
    }

    // Business logic: Update an item
    public void updateItem(Item item) {
        itemValidator.validate(item);           // Delegate validation
        itemLogger.logUpdate(item);             // Delegate logging
        itemRepository.update(item);            // Delegate in-memory persistence
    }

    // Business logic: Delete an item
    public void deleteItem(String itemName) {
        itemLogger.logDeletion(itemName);       // Delegate logging
        itemRepository.delete(itemName);        // Delegate in-memory persistence
    }

    // Display items (for testing purposes)
    public void displayItems() {
        itemRepository.getItems().forEach(i -> System.out.println(i.getName() + ": " + i.getPrice()));
    }
}
