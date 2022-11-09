package Materi.ASD_P9;

import java.util.Scanner;

public class Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree binaryTree = new BinaryTree();
        int loop = sc.nextInt();
        for (int i = 0; i < loop; i++) {
            binaryTree.insertion(new Node(sc.nextInt()));
        }
        System.out.println("Preorder");
        binaryTree.preorder();
        System.out.println("\nInorder");
        binaryTree.inorder();
        System.out.println("\nPostorder");
        binaryTree.postorder();

    }
}

class Node {
    Node left;
    Node right;
    int value;
    Node(int value) {
        this.value = value;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    void insertion(Node newNode) {
        if (root != null) {
            insert(root, newNode);
        }
        else {
            root = newNode;
        }
    }

    Node insert(Node node, Node newNode) {
        if (node == null) {
            node = newNode;
            return node;
        }
        if (newNode.value < node.value) {
            node.left = insert(node.left, newNode);
        } else if (newNode.value > node.value) {
            node.right = insert(node.right, newNode);
        }
        return node;
    }
    private void printPreorder(Node tmp){
        if (tmp != null) {
            System.out.print(tmp.value + ", ");
            printPreorder(tmp.left);
            printPreorder(tmp.right);
        }
    }

    private void printInorder(Node tmp){
        if (tmp != null) {
            printInorder(tmp.left);
            System.out.print(tmp.value + ", ");
            printInorder(tmp.right);
        }
    }

    private void printPostorder(Node tmp){
        if (tmp != null) {
            printPostorder(tmp.left);
            printPostorder(tmp.right);
            System.out.print(tmp.value + ", ");
        }
    }

    void inorder(){
        printInorder(root);
    }
    void postorder(){
        printPostorder(root);
    }
    void preorder(){
        printPreorder(root);
    }

}
