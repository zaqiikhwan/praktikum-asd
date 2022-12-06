package Materi.HeapTree;
// copy dari baris ketiga sampai terakhir
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        HeapTree heapTree = new HeapTree();
        int loop = sc.nextInt();
        for (int i = 0; i < loop; i++) {
            heapTree.insertNode(sc.nextInt());
        }
        // isi bagian sini
    }
}

class Node {
    Node left;
    Node right;
    Node parent;
    int value;
    Node(int value) {
        this.value = value;
        left = right = parent = null;
    }
}

class HeapTree {
    Node root;

    HeapTree() {
        root = null;
    }

    public void insertNode(int value){
        Node newNode = new Node(value);
        if(root == null){
            root = newNode;
        } else {
            // implementasi menggunakan queue atau linkedlist bebas
            // isi bagian sini
        }
    }

    // swap untuk maxHeap
    public void swapNode(Node now){
        // isi bagian sini
    }

    private void printPreorder(Node root){
        if (root != null) {
            System.out.print(root.value + ", ");
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }

    private void printInorder(Node root){
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.value + ", ");
            printInorder(root.right);
        }
    }

    private void printPostorder(Node root){
        if (root != null) {
            printPostorder(root.left);
            printPostorder(root.right);
            System.out.print(root.value + ", ");
        }
    }

    public boolean printLevel(Node root, int level) {
        if (root == null) {
            return false;
        }

        if (level == 1) {
            System.out.print(root.value + ", ");
            return true;
        }

        // isi bagian sini
        return true; // boolean;
    }

    public void levelOrderTraversal(Node root) {
        // isi bagian sini
    }

    public void inOrder(){
        printInorder(root);
    }

    public void postOrder(){
        printPostorder(root);
    }

    public void preOrder(){
        printPreorder(root);
    }

    public void levelOrder() {
        levelOrderTraversal(root);
    }

}
