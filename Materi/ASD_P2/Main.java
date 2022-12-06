package Materi.ASD_P2;
/* Dilarang mengimpor library lain */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Masukkan kode di sini. Selamat mengerjakan! */
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String loop = sc.nextLine();
        for (int i = 0; i < Integer.parseInt(loop); i++) {
            String input = sc.nextLine();
            switch (input.split(" ")[0]) {
                case "LIHAT":
                    String result = linkedList.isEmpty() ? "<" : "<-" + linkedList;
                    System.out.println(result);
                    break;
                case "TAMBAH":
                    if (input.split(" ")[2].equals("AWAL")) {
                        linkedList.addFirst(input.split(" ")[1]);
                    } else {
                        linkedList.addLast(input.split(" ")[1]);
                    }
                    break;
                case "LEPAS":
                    if (input.split(" ")[1].equals("AWAL") && !linkedList.isEmpty()) {
                        linkedList.removeFirst();
                    } else if (input.split(" ")[1].equals("AKHIR") && !linkedList.isEmpty()) {
                        linkedList.removeLast();
                    }
                    break;
            }
        }
    }
}



/* Jangan ubah kode di bawah ini */

class LinkedList<T> {
    private Node<T> head, tail;
    private int size = 0;

    public LinkedList() {
        this.head = this.tail = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return this.size;
    }

    public void addFirst(T data) {
        Node<T> node = new Node<>(data);
        if (isEmpty()) {
            this.head = this.tail = node;
        }
        else {
            node.next = this.head;
            this.head = node;
        }
        this.size++;
    }

    public void addLast(T data) {
        Node<T> node = new Node<>(data);
        if (isEmpty()) {
            this.head = this.tail = node;
        }
        else {
            this.tail.next = node;
            this.tail = node;
        }
        this.size++;
    }

    public void removeFirst() {
        if (!isEmpty()) {
            if (this.head == this.tail) {
                this.head = this.tail = null;
            }
            else {
                Node<T> temp = this.head;
                this.head = null;
                this.head = temp.next;
            }
            this.size--;
        }
        else throw new ArrayIndexOutOfBoundsException();
    }

    public void removeLast() {
        if (!isEmpty()) {
            if (this.head == this.tail) {
                this.head = this.tail = null;
            }
            else {
                Node<T> temp = this.head;
                while (temp.next != this.tail) temp = temp.next;
                this.tail = temp;
                this.tail.next = null;
            }
            this.size--;
        }
        else throw new ArrayIndexOutOfBoundsException();
    }

    public T getFirst() {
        return this.head.data;
    }

    public T getLast() {
        return this.tail.data;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        Node<T> temp = this.head;
        while (temp != null) {
            s.append(temp.data);
            if (temp.next != null) s.append("-");
            temp = temp.next;
        }
        return s.toString();
    }
}

class Node<T> {
    public T data;
    public Node<T> next;

    public Node() {
        this(null);
    }

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}