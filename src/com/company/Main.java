package com.company;

public class Main {

    static class Queue {
        int value;
        Queue next;
        Queue prev;
    }

    static Queue head;

    public static void main(String[] args) {
        init();
        for (int i = 1; i < 5; i++) {
            add(i * -1);
        }
        print();
        task2();
        print();
    }

    private static void init() {
        head = new Queue();
        head.next = head;
        head.prev = head;
    }

    private static void add(int val) {
        Queue queue = new Queue();
        queue.value = val;
        queue.next = head;
        queue.prev = head.prev;
        head.prev.next = queue;
        head.prev = queue;
    }

    private static void print() {
        Queue h = head.next;
        while (h != head) {
            System.out.println(h.value);
            h = h.next;
        }
    }

    private static void printReverse() {
        Queue h = head.prev;
        while (h != head) {
            System.out.println(h.value);
            h = h.prev;
        }
    }

    static void deleteMin() {
        Queue min = new Queue();
        min.value = Integer.MAX_VALUE;
        Queue h = head.prev;
        while (h != head) {
            if (min.value > h.value) {
                min = h;
            }
            h = h.prev;
        }
        min.prev.next = min.next;
        min.next.prev = min.prev;
    }

    static void task2() {
        Queue h = head.next;
        while (h.next != head) {
            if (h.value < 0 && h.next.value < 0) {
                Queue elem = new Queue();
                elem.value = 99;
                h.next.prev = elem;
                elem.next = h.next;
                elem.prev = h;
                h.next = elem;
            }
            h = h.next;
        }
    }

}
