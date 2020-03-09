package exams;

import java.util.ArrayList;

public class Driver1 {
    // "instance variable" ArrayList of 'Object'
    //  - not static
    private ArrayList<String> objs = new ArrayList<>();

    // helper methods
    public void addObject(String obj) {
        objs.add(obj);
    }

    public void printObjs() {
        for (String obj: objs) {
            System.out.println(obj);
        }
    }


    public static void main(String[] args) {
        Driver1 d = new Driver1();
        d.addObject("Hello");
        d.addObject("Hi");
        d.addObject("Hola");
        d.printObjs();

    }
}
