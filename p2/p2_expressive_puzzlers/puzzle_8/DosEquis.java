package p2_expressive_puzzlers.puzzle_8;

public class DosEquis {
    public static void main(String[] args) {
        char x = 'X';
        int i = 0;
        System.out.println(true ? x : 0);
        System.out.println(false ? i : x);
    }
}