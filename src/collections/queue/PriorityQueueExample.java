package collections.queue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>();
        pq.offer("Java");
        pq.offer("Python");
        pq.offer("PHP");
        pq.offer("Ruby");
        pq.offer("Javascript");
        pq.offer("C/C++");
        pq.offer("Go");
        pq.offer("Rust");
        pq.offer("Dart");
        pq.offer("C#");
        pq.offer("ArnoldC");

        // 1. iterate elements in the queue (by priority)
//        while (!pq.isEmpty()) {
//            System.out.println(pq.poll());
//        }

        // 2. toArray -> Binary heap order
//        Object[] arr = pq.toArray(); // "Binary Heap Order"
//        for (Object lang: arr) {
//            System.out.println(lang);
//        }

        // 3. Iterator: "Binary heap order"
        Iterator<String> cursor = pq.iterator();
        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }

        Student aga = new Student("Agamenon", (int) (Math.random() * 100));
        Student carlos = new Student("Carlos", (int) (Math.random() * 100));
        Student cayo = new Student("Cayo", (int) (Math.random() * 100));
        Student ivan = new Student("Ivan", (int) (Math.random() * 100));
        Student hermilo = new Student("Hermilo", (int) (Math.random() * 100));

        PriorityQueue<Student> students = new PriorityQueue<>();
        students.add(aga);
        students.add(carlos);
        students.add(cayo);
        students.add(ivan);
        students.add(hermilo);

        while (!students.isEmpty()) {
            System.out.println(students.poll());
        }

    }
}