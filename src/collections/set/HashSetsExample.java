package collections.set;

import java.util.HashMap;
import java.util.HashSet;

public class HashSetsExample {
    public int distinct(int year) {
        while (true) {
            HashSet<Integer> yearNext = new HashSet<>();
            year += 1;
            int a = year % 10;
            int b = (year / 10) % 10;
            int c = (year / 100) % 10;
            int d = (year / 1000) % 10;
            yearNext.add(a);
            yearNext.add(b);
            yearNext.add(c);
            yearNext.add(d);
            if (yearNext.size() == 4) {
                return year;
            }
        }
    }

    //public void print(HashMap<String, String> country) {}

    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();
        countries.put("B.C", "Victoria");
        countries.put("Al", "Edmonton");
        countries.put("Ot", "Toronto");

        for (String country : countries.values()) {
            System.out.println(country);
        }
        for (String key : countries.keySet()) {
            System.out.println(countries.get(key));
        }

        HashSetsExample test = new HashSetsExample();
        System.out.println(test.distinct(1900));

        //  create an empty HashSet
        HashSet<String> food = new HashSet<>();
            food.add("Sushi");
            food.add("Pizza");
            food.add("Hotdog");
            food.add("Taco");
            food.add("Taco");
            food.add("Taco");
            food.add("Feijoada");
            food.add("Feijoada");
            food.add("Feijoada");
            food.add("Coxinha");
            food.add("Sushi");
            food.add("Sushi");
        //  duplicates will not be added

        //  size
            System.out.println(food.size());
            System.out.println(food);

        HashSet<String> food2 = new HashSet<>();
            food2.add("Ramen");
            food2.add("Poutine");
            food2.add("Ajiaco");
            food2.add("Hamburger");
            food2.add("Sushi");
            food2.add("Taco");

        //  food.addAll(food2); // union
        //  System.out.println(food);

        //  food.retainAll(food2); // intersection
            food.removeAll(food2);
            System.out.println(food);

        //  checks if the set has "Sushi"
            if (food.contains("Sushi")) { // O(1)
            System.out.println(true);
        }

    }
}
