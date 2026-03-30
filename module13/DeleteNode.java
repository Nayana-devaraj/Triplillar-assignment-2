package Assignment5.Module13;
// Delete a node from a BST

class Node8 {
    int data;
    Node left, right;

    Node8(int value) {
        data = value;
        left = right = null;
    }
}

public class DeleteNode {

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


    Node findMin(Node root) {
        while (root.left != null)
            root = root.left;
        return root;
    }


    Node delete(Node root, int key) {
        if (root == null)
            return null;

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {

            if (root.left == null && root.right == null)
                return null;


            else if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;


            Node temp = findMin(root.right);
            root.data = temp.data;
            root.right = delete(root.right, temp.data);
        }
        return root;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        DeleteNode tree = new DeleteNode();

        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        System.out.print("Before Deletion: ");
        tree.inorder(tree.root);

        tree.root = tree.delete(tree.root, 50); // delete node

        System.out.print("\nAfter Deletion: ");
        tree.inorder(tree.root);
    }
}
