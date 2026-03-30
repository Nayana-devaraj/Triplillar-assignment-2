package Assignment5.Module12;

class Node1 {
    int data;
    Node left, right;


    Node1(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTreePreorder {

    Node root;

    void preorderTraversal(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder Traversal:");
        tree.inorderTraversal(tree.root);
    }
}