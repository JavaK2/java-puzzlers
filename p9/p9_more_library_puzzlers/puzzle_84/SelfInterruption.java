package p9_more_library_puzzlers.puzzle_84;

public class SelfInterruption {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        if (Thread.interrupted()) {
            System.out.println("Interrupted: " + Thread.interrupted());
        } else {
            System.out.println("Not interrupted: " + Thread.interrupted());
        }
    }
}