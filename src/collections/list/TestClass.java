package collections.list;


public class TestClass {
    public static void main(String[] args) {
        MyArrayList<String> countries = new MyArrayList<String>();
        MyArrayList<String> countries2 = new MyArrayList<String>();
        countries.add("Taiwan");
        countries.add("Greece");
        countries.add("Canada");
        countries.add("USA");
        countries.add("Japan");
        countries.add("Brazil");
        countries.add("France");
        countries.add("USA");
        countries2.add("Russia");
        countries2.add("Poland");
        countries2.add("France");


        // System.out.println(countries.add("France"));
        // System.out.println(countries);
        // countries.add(3,"Austria");
        // System.out.println(countries.addAll(countries2));
        System.out.println(countries);
        // System.out.println(countries.addAll(0,countries2));
        System.out.println(countries);
        // System.out.println(countries.removeAll(countries2));
        System.out.println(countries.retainAll(countries2));
        System.out.println(countries);
        // System.out.println(countries.containsAll(countries2));
        // System.out.println(countries.remove("Taiwan"));
        // System.out.println(countries.remove(8));
        countries.add(10, "Egypt");
        System.out.println(countries.remove(2));
        System.out.println();
        System.out.println(countries.lastIndexOf("USA"));
        System.out.println(countries);
        // countries.clear();
        // System.out.println(countries);
    }

}
