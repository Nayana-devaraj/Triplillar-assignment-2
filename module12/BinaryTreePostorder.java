package Assignment5.Module12;

class Node2 {
    int data;
    Node left, right;

    Node2(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTreePostorder {

    Node root;

    void postorderTraversal(Node node) {
        if (node == null)
            return;

        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Postorder Traversal:");
        tree.inorderTraversal(tree.root);
    }
}