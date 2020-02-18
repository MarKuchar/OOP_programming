package basics;

import java.util.Scanner;

public class IOExample {
    public static void main(String[] args) {
        // Write a program to say hello in each language
        // "en" - English
        // "br" - Portuguese
        // "sk" - Slovak
        // "no" - Norwegian

        Scanner in = new Scanner(System.in);
        System.out.println("Choose the language: ");
        String countryCode = in.nextLine();  // same as input() in python
        switch (countryCode) {
            case "en":
                System.out.println("Hello");
                break;
            case "br":
                System.out.println("Oi");
                break;
            case "sk":
                System.out.println("Ahoj");
                break;
            case "no":
                System.out.println("Hei");

        }
    }
}