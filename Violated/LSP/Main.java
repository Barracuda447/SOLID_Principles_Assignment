package Violated.LSP;

public class Main {

    public static void main(String[] args) {
        // Create instances of Bird and Penguin
        Bird bird = new Bird();
        Penguin penguin = new Penguin();
        bird.fly();  // Works as expected
        penguin.fly();  // Breaks LSP
    }
}
