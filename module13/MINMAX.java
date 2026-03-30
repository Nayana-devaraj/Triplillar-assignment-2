package Assignment5.Module13;
// Find Minimum and Maximum in a BST

class Node7 {
    int data;
    Node left, right;

    Node7(int value) {
        data = value;
        left = right = null;
    }
}

public class MINMAX {

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

    int findMin(Node root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return -1;
        }

        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }


    int findMax(Node root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return -1;
        }

        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }

    public static void main(String[] args) {
        MINMAX tree = new MINMAX();


        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        System.out.println("Minimum element: " + tree.findMin(tree.root));
        System.out.println("Maximum element: " + tree.findMax(tree.root));
    }
}