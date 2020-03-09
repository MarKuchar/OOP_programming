package exams;

import java.util.ArrayList;

public class exam1 {
    public static void main(String[] args) {
        // Arrays vs ArrayList
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(1);
        al.add(2);
        // to remove all 1s...
        // 'shifting' happens - so go backwards!
        for (int i = al.size() - 1; i >= 0; i--) {
            if (al.get(i) == 1) {
                al.remove(i);
            }
        }
        // for-each loop
        for (Integer i : al) {
        }
        // inheritance "is-a" relationship
        class A {
        }
        class B extends A {
        }
        class C extends A {
        }
        class D extends B {
        }
        // A a = new B();  // ok? yes
        // A a = new C();  // ok? yes
        // A a = new D();  // ok? yes
        // D a = new B();  // ok? no
        // C a = new B();  // ok? no"
        // Random number
        // in java.util.Math (class)
        // there are many static methods
        // 5 <= (int) (Math.random() * 5) + 5 < 10
        int random = (int) (Math.random() * 5) + 5;
        System.out.println(random);
        // returns double(0.000000 ...0.9999999)
        // how to get a random "integer" between 5 <=   < 10  ?
        // abstract class: "class" + abstract methods
        abstract class Employee {
            // instance method, yes
            public void work() {
                System.out.println("Hello, I'm working!");
            }

            // abstract method, yes
            public abstract int getPayment();
        }
        // 1. no child class, is it necessary to create an abstract class?
        // - No, you must have at least one subclass.
        // 10 MC
        // Coding Problem - similar to lab
        // polymorphism, inheritance, abstraction, interface
        // method overriding, method overloading, encapsulation
        // compile-time vs run-time
    }
}