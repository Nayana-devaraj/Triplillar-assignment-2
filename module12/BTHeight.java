package Assignment5.Module12;
class Node3 {
    int data;
    Node left, right;

    Node3(int value) {
        data = value;
        left = right = null;
    }
}

public class BTHeight {

    Node root;

    int findHeight(Node node) {
        if (node == null)
            return 0;   // safer for exams (height in terms of nodes)

        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        BTHeight tree = new BTHeight();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Height: " + tree.findHeight(tree.root));
    }
}