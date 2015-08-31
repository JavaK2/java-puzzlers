package p2_expressive_puzzlers.puzzle_3;

public class LongDivision {
    public static void main(String[] args) {
        final long MICROS_PER_DAY_WRONG = 24 * 60 * 60 * 1000 * 1000; //incorrect way
        final long MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1000; //correct way
        final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
        
        System.out.println(MICROS_PER_DAY_WRONG / MILLIS_PER_DAY);//Outputs 5
        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);//Outputs 1000
    }
}