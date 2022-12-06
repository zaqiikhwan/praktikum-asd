package Materi.ASD_P9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().replaceAll(" ", "");

        char[] temp = input.toCharArray();

        for (int cast:temp) {
            bst.insertion(new Node(cast));
        }
        System.out.print("Preorder  : ");
        bst.preorder();
        System.out.print("\nInorder   : ");
        bst.inorder();
        System.out.print("\nPostorder : ");
        bst.postorder();

    }
}

class NodeTemp {
    NodeTemp left;
    NodeTemp right;
    int value;
    NodeTemp(int value) {
        this.value = value;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    BinarySearchTree() {
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

    private Node insert(Node node, Node newNode) {
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
            System.out.print((char) tmp.value + ", ");
            printPreorder(tmp.left);
            printPreorder(tmp.right);
        }
    }

    private void printInorder(Node tmp){
        if (tmp != null) {
            printInorder(tmp.left);
            System.out.print((char) tmp.value + ", ");
            printInorder(tmp.right);
        }
    }

    private void printPostorder(Node tmp){
        if (tmp != null) {
            printPostorder(tmp.left);
            printPostorder(tmp.right);
            System.out.print((char) tmp.value + ", ");
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
