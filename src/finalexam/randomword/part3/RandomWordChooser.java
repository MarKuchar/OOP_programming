package finalexam.randomword.part3;

import java.util.*;

public class RandomWordChooser {
    private ArrayList<String> words = new ArrayList<>();

    public RandomWordChooser() {
    }

    public RandomWordChooser(String[] wordArray) {
        Collections.addAll(words, wordArray);
    }

    public String getNext() {
        if (words.isEmpty()) {
            return "NONE";
        }
        Random rand = new Random();
        return words.remove(rand.nextInt(words.size()));
    }
}
