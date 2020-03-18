package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    // HashMap<K, V>: A set of key-value pairs
    public static void main(String[] args) {
        Map<String, String> acronyms = new HashMap<>();
        acronyms.put("Lol", "Laughing out loud");
        acronyms.put("Yolo", "You only live once");
        acronyms.put("Smh", "Shake my head");
        acronyms.put("lmk", "Let me know");
        acronyms.put("Brb", "Be right back");
        acronyms.put("Lmao", "Laughing my ass off");
        acronyms.put("stfu", "Shut the fxxx up");
        acronyms.put("afk", "away from keyboard");
        acronyms.put("rofl", "Rolling on the floor laughing");
        acronyms.put("idk", "I don't know");

        System.out.println(acronyms.get("stfu"));
        System.out.println(acronyms.containsKey("idk"));
        System.out.println(acronyms.containsKey("fyi"));
        System.out.println(acronyms.size());

        // loop through the map key-value pairs
        // map is not sorted (no order)

        // Iterate by keys - no order preserved
        for(String key: acronyms.keySet()) {
            System.out.println(key);
            System.out.println(acronyms.get(key)); // value
        }

        // Iterate by values - no order preserved
        for(String value: acronyms.values()) {
            System.out.println(value);
        }
    }
}