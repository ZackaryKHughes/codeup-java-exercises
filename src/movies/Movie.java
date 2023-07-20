package movies;
import java.util.Random;

public class Movie {

    private String name;
    private String category;

    public static void main(String[] args) {
        String[] adjectives = {"happy", "sad", "faster", "gross", "bored", "lonely", "cool", "messy", "rigid", "awful", "mischievous"};
        String[] nouns = {"mother", "father", "brother", "sister", "president", "girl", "boy", "shoe", "basketball", "Disneyland"};

        String randomAdjective = getRandom(adjectives);
        String randomNoun = getRandom(nouns);

        String hyphenatedName = randomAdjective + "-" + randomNoun;
        System.out.println(hyphenatedName);
    }

    public static String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
