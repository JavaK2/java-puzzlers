package p3_puzzlers_with_character.puzzle_14;

public class EscapeRout {
    public static void main(String[] args) {
        // \u0022 is the Unicode escape for double-quote (")
    	//"a\u0022.length() + \u0022b".length() = "a\".length + \"".length()
    	// = "2 + \"".length = "2\"".length = 2
        System.out.println("a\u0022.length() + \u0022b".length());
    }
}