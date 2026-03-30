package Assignment5.Module13;
// Search for a key in a Binary Search Tree

class Node6 {
    int data;
    Node left, right;

    Node6(int value) {
        data = value;
        left = right = null;
    }
}

public class BSTSearch {

    Node root;


    Node insert(Node root, int value) {
        if (root == null)
            return new Node(value);

        if (value < root.data)
            root.left = insert(root.left, value);
        else if (value > root.data)
            root.right = insert(root.right, value);

        return root;
    }


    boolean search(Node root, int key) {
        if (root == null)
            return false;

        if (key == root.data)
            return true;
        else if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    public static void main(String[] args) {
        BSTSearch tree = new BSTSearch();

        // Insert elements
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        int key = 60;

        if (tree.search(tree.root, key))
            System.out.println("Key " + key + " found in BST");
        else
            System.out.println("Key " + key + " not found in BST");
    }
}