package Materi.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.addFirst(10);
        sll.addFirst(9);
        sll.addLast(11);
        sll.addLast(12);
        sll.printData();
        sll.removeFirst();
        sll.printData();
        sll.removeFirst();
        sll.printData();
        sll.removeLast();
        sll.printData();
        sll.removeLast();
        sll.printData();
    }
}

class Node {
    Node next;
    int value;

    Node (int value) {
        this.value = value;
    }

}

class SingleLinkedList {
    Node head;
    Node tail;
    int size = 0;

    int length() {
        return this.size;
    }

    void addLast(int data) {
        Node node = new Node(data);

        if (length() == 0) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    void addFirst(int data) {
        Node node = new Node(data);

        if (length() == 0) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    void removeFirst() {
        if (length() == 1) {
            head = tail = null;
        } else {
            Node temp = this.head;
            this.head = temp.next;
        }
        size--;
    }

    void removeLast() {
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
        if (temp == null) System.out.print("LinkedList kosong");
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
