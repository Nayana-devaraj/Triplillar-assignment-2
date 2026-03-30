package Assignment5.Module13;
// Check if a Binary Tree is a Valid BST

class Node9 {
    int data;
    Node left, right;

    Node9(int value) {
        data = value;
        left = right = null;
    }
}

public class ValadityofBST {

    Node root;

    boolean isBST(Node node, int min, int max) {
        if (node == null)
            return true;

        if (node.data <= min || node.data >= max)
            return false;

        return isBST(node.left, min, node.data) &&
                isBST(node.right, node.data, max);
    }

    public static void main(String[] args) {
        ValadityofBST tree = new ValadityofBST();

        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(40);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(80);

        if (tree.isBST(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE))
            System.out.println("The tree is a valid BST");
        else
            System.out.println("The tree is NOT a valid BST");
    }
}