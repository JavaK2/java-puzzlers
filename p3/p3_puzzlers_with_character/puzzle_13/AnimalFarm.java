package p3_puzzlers_with_character.puzzle_13;

public class AnimalFarm {
    public static void main(String[] args) {
        final String pig = "length: 10";
        final String dog = "length: " + pig.length();
        
        System.out.println(pig);
        System.out.println(dog);

        System.out.println("Animals are equal: "
                + pig == dog);
        
        System.out.println("Animals are equal: "
                + pig.equals(dog));
    }
}
