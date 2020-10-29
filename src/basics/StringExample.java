package basics;

public class StringExample {
    public static void main(String[] args) {
        // String - a sequence of chars
        // Reference type
        // 1. String literal
        // (data segment - read only)
        String name = "Derrick";  // store at the same place as name1 (same reference)
        String name1 = "Derrick";

        // heap segment - dynamically allocate memory
        String name2 = new String("Derrick");
        System.out.println(name == name1);  // True - it compares the reference numbers of two strings, not the values
        System.out.println(name == name2);  // False

        // if you want to compare content of two strings
        System.out.println(name.equals(name1));
        System.out.println(name1.equals(name2));

        // Get the length of string
        String coffee = "Starbucks";
        System.out.println(coffee.length());

        // Get the substring
        // in python coffee[0:4] => "Star"
        System.out.println(coffee.substring(0, 4));

        // Get the index of string
        System.out.println(coffee.indexOf("bucks"));

        // String with for-loop (print every char)
        for (int i = 0; i < coffee.length(); i++) {
            // 'char' primitive type
            // 'String'
            System.out.print(coffee.substring(i, i + 1));
            if (i == coffee.length() - 1) {
                System.out.println();
            }
        }

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            if (i == name.length() - 1) {
                System.out.println();
            }
        }

        // Converting String to char array
        char[] chars = coffee.toCharArray();
        for (char ch: coffee.toCharArray()) {
            System.out.print(ch);
        }
        // if you want to identify chars, you can use different functions


        
    }
}
