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
        System.out.println("\nLevelorder");
        binaryTree.levelOrder();

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

    void inorder(){
        printInorder(root);
    }
    void postorder(){
        printPostorder(root);
    }
    void preorder(){
        printPreorder(root);
    }

    public static boolean printLevel(Node root, int level)
    {
        // base case
        if (root == null) {
            return false;
        }

        if (level == 1) {
            System.out.print(root.value + ", ");

            // return true apabila ada 1 node yang berada pada level tersebut
            return true;
        }

        boolean left = printLevel(root.left, level - 1);
        boolean right = printLevel(root.right, level - 1);

        return left || right;
    }

    // fungsi untuk print level order traversal dari binary tree
    public void levelOrderTraversal(Node root)
    {
        // dimulai dari level 1 hingga level tertinggi tree
        int level = 1;

        // berjalan sampain method printlevel() mengembalikan nilai false
        while (printLevel(root, level)) {
            level++;
        }
    }

    public void levelOrder() {
        levelOrderTraversal(root);
    }

}
