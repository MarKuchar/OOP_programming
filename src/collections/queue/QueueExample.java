package collections.queue;

import java.util.*;

public class QueueExample {
    public static void stutter(Queue<Integer> q) {
        for (int i = 0; i < 3; i++) {
            int a = q.peek();
            q.add(a);
            q.add(a);
            q.poll();
        }
    }

    public static void mirror(Queue<String> q) {
        Stack<String> a = new Stack<>();
        int length = q.size();
        while(length --> 0) {
            String i = q.poll();
            a.push(i);
            q.offer(i);
        }
        while (!a.empty()) {
            q.offer(a.pop());
        }
    }

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Queue<String> q = new ArrayDeque<>();
        Queue<String> pq = new PriorityQueue<>();

        queue.add("Coke");
        queue.add("Pepsi");
        queue.add("Ginger Ale");
        queue.add("Sprite");
        queue.add("Fanta");

        Queue<Integer> qa = new ArrayDeque<>();
        qa.add(1);
        qa.add(2);
        qa.add(3);

        Queue<String> qb = new ArrayDeque<>();
        qb.add("a");
        qb.add("b");
        qb.add("c");

        stutter(qa);
        System.out.println(qa);
        mirror(qb);
        System.out.println(qb);


        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
