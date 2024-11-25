package Solved.SRP;

import java.util.logging.Logger;

public class ItemLogger {

    private static final Logger logger = Logger.getLogger(ItemLogger.class.getName());

    public void logCreation(Item item) {
        logger.info("Creating item: " + item.getName());
    }

    public void logUpdate(Item item) {
        logger.info("Updating item: " + item.getName());
    }

    public void logDeletion(String itemName) {
        logger.info("Deleting item: " + itemName);
    }
}
