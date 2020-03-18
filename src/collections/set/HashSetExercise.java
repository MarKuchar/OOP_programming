package collections.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class HashSetExercise {
    public static void main(String[] args) {
        uniqueDigitsHashSet();
    }

    public static void uniqueDigitsHashSet() {
        Scanner in = new Scanner(System.in);
        String year = in.nextLine();
        int yearInt = Integer.parseInt(year);
        for (int i = yearInt + 1; i < 10235; i++) {
            String yearStr = String.valueOf(i);
            HashSet<Character> set = new HashSet<>();
            for (Character ch : yearStr.toCharArray()) {
                if (!set.add(ch)) {
                    break;
                }
            }
            if (yearStr.length() == set.size()) {
                System.out.println(yearStr);
                break;
            }
        }
        in.close();
    }

    public static void usingStream() {
        Scanner in = new Scanner(System.in);
        String year = in.nextLine();
        int yearInt = Integer.parseInt(year);
        for (int y = yearInt + 1; y < 10235; y++) {
            String strYear = String.valueOf(y);
            Set<Character> set = strYear.chars()
                    .mapToObj(ch -> (char) ch)
                    .collect(Collectors.toSet());
            if (strYear.length() == set.size()) {
                System.out.println(strYear);
                break;
            }
        }
        in.close();
    }
}
