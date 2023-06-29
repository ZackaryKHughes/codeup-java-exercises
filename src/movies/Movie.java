package movies;
import java.util.Random;

public class Movie {
    public static void main(String[] args) {
        String[] adjectives = {"happy", "sad", "angry", "excited", "bored", "tired", "hungry", "thirsty", "cold", "hot"};
        String[] nouns = {"dog", "cat", "bird", "fish", "lion", "tiger", "elephant", "giraffe", "monkey", "snake"};

        String randomAdjective = getRandom(adjectives);
        String randomNoun = getRandom(nouns);

        String hyphenatedName = randomAdjective + "-" + randomNoun;
        System.out.println(hyphenatedName);
    }

    public static String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
}
