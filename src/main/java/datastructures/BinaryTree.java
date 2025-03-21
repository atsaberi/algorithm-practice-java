package datastructures;

public class BinaryTree {

    class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    public void insert(int value) {
        root = recursiveInsert(root, value);
    }

    private Node recursiveInsert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (root.left == null) {
            root.left = new Node(value);
        } else if (root.right == null) {
            root.right = new Node(value);
        } else {
            recursiveInsert(root.left, value);
        }
        return root;
    }


}
