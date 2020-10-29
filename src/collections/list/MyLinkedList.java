package collections.list;

import java.util.LinkedList;

// Doubly-Linked list
public class MyLinkedList<E> {
    private int size;
    private Node head, tail;

    private static class Node<E> {
        E data;
        Node next;
        Node prev;

        Node(E data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public boolean contains(E data) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.data == data) {
                return true;
            } else {
                temp = temp.next;
            }
        }
        return false;
    }

    public void add(int i, E data) {
        indexController(i);
        Node temp = head;
        Node tempTail = tail;
        if (isEmpty()) {
            Node newNode = new Node(data, null, null);
            head = newNode;
            tail = newNode;
        }
        if (i == 0) {
            Node newNode = new Node(data, temp, null);
            temp.prev = newNode;
            head = newNode;
        } else if (i == size - 1) {
            Node newNode = new Node(data, null, tempTail);
            tempTail.next = newNode;
            tail = newNode;
        } else {
            for (int j = 0; j < i - 1; j++) {
                temp = temp.next;
            }
            Node oldNode = temp.next;
            Node newNode = new Node(data, oldNode, temp);
            temp.next = newNode;
            oldNode.prev = newNode;
            oldNode.next = newNode.next.next;
        }
        size++;
    }

    public void add(E data) {
        if (isEmpty()) {
            Node newNode = new Node(data, null, null);
            head = newNode;
            tail = newNode;
        } else {
            Node newNode = new Node(data, null, tail.prev);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public E remove(int i) {
        indexController(i);
        Node prevNode = head;
        if (i == 0) {
            Node oldNode = prevNode;
            head = prevNode.next;
            prevNode.next = prevNode.next.next;
            return (E) oldNode.data;
        }
        for (int j = 0; j < i - 1; j++) {
            prevNode = prevNode.next;
        }
        Node oldNode = prevNode.next;
        prevNode.next = prevNode.next.next;
        return (E) oldNode.data;
    }

    public E get(int i) {
        indexController(i);
        Node getNode = head;
        for (int j = 0; j < i; j++) {
            getNode = getNode.next;
        }
        return (E) getNode.data;
    }

    public E set(int i, E newData) {
        indexController(i);
        Node setNode = head;
        if (i == 0) {
            Node oldNode = setNode;
            Node newNode = new Node(newData, setNode.next, null);
            setNode.next = newNode;
            head = newNode;
            return (E) oldNode.data;
        }
        for (int j = 0; j < i - 1; j++) {
            setNode = setNode.next;
        }
        Node oldNode = setNode.next;
        Node newNode = new Node(newData, setNode.next.next, setNode);
        setNode.next = newNode;
        return (E) oldNode.data;
    }

    public void indexController(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + " out of range.");
        }
    }

    @Override
    public String toString() {
        Node temp = head;
        String result = "[";
        while (temp.next != null) {
            result += temp.data + ", ";
            temp = temp.next;
        }
        result += temp.data + "]";
        return result;
    }

    public static void main(String[] args) {
        MyLinkedList<String> mll1 = new MyLinkedList();
        LinkedList<String> ll1 = new LinkedList();

        mll1.add("Milan");
        mll1.add("Paris");
        mll1.add("Roma");
        mll1.add("Moscow");

        // System.out.println(mll1.contains("Moscow"));
        // System.out.println(ll1);
        // ll1.add(1, "Budapest");
        System.out.println(mll1);
        mll1.add(0, "Budapest");
        System.out.println(mll1.remove(4));
        System.out.println(mll1);
        System.out.println(mll1.get(0));
        System.out.println(mll1.set(0, "Bratislava"));
        System.out.println(mll1);
    }
}