package Solved.SRP;

public class ItemValidator {

    public void validate(Item item) {
        if (item == null || item.getName() == null || item.getPrice() <= 0) {
            throw new IllegalArgumentException("Invalid item data.");
        }
    }
}
