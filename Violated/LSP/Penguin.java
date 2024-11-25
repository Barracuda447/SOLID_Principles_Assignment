package Violated.LSP;

public class Penguin extends Bird {

    // Override fly method with a message stating that penguins can't fly
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly!");
    }
}
