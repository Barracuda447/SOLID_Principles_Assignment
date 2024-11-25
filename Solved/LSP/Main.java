package Solved.LSP;

public class Main {
    
    public static void main(String[] args) {
        // Create instances of different birds
        Bird bird = new Bird();
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        // Birds can eat, regardless of their ability to fly
        bird.feed(); // Works as expected
        sparrow.feed(); // Works as expected
        penguin.feed(); // Works as expected

        // Only sparrows can fly, and we check if they can before calling fly
        if (sparrow instanceof CanFly) {
            sparrow.fly();// Works as expected
        }

        // Penguins do not fly, so we call swim
        penguin.swim();  // Works as expected
    }
}
