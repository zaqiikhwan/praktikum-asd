package Materi.ASD_P4;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Object> stack = new Stack<>();

        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.add(10);
        stack.add(11);
        stack.add(12);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);


//        StackScratch stackScratch = new StackScratch();
//        stackScratch.push(10);
//        stackScratch.push(11);
//        stackScratch.push(12);
//
//        stackScratch.printData();
//        System.out.println(stackScratch.peek());
//
//        stackScratch.pop();
//        stackScratch.printData();
//
//        System.out.println(stackScratch.peek());
    }
}

class Node {
    Node next;
    Object value;

    Node (Object value) {
        this.value = value;
    }
}

class StackScratch {
    Node head;
    Node tail;
    int size = 0;

    int length() {
        return this.size;
    }

    boolean isEmpty() {
        return length() == 0;
    }

    Object peek() {
        return tail.value;
    }

    void push(Object data) {
        Node node = new Node(data);

        if (isEmpty()) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    void pop() {
        if (length() == 1) {
            head = tail = null;
        } else {
            Node temp = this.head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            tail = temp;
            temp.next = null;
        }
        size--;
    }

    void printData() {
        Node temp = this.head;
        if (temp == null) System.out.print("Stack kosong");
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
