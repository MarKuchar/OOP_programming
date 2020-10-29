package finalexam.randomword.part3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RandomCharChooser extends RandomWordChooser {
    private static ArrayList<String> words = new ArrayList<>();
    private static String[] letters;

    public RandomCharChooser(String word) {
        this.letters = getSingleChars(word);
    }

    public static String[] getSingleChars(String str) {
        String[] letters = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            letters[i] = String.valueOf(str.charAt(i));
        }
        Collections.addAll(words, letters);
        return letters;
    }

    @Override
    public String getNext() {
        if (words.size() == 0) {
            return "NONE";
        }
        Random rand = new Random();
        return words.remove(rand.nextInt(words.size()));
    }
}
