// Topic : Binary Tree
// Pre-Order
// Node -> LST -> RST
// also we will implement the PreOrder Traversal, Inorder Traversal, PostOrder Traversal , LevelOrder Traversal

import java.util.LinkedList;
import java.util.Queue;

public class hundredtwentyeight128 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // Traversal using PreOrder

        public static void preorderTrav(Node root) { // tc: O(n)
            if (root == null) {
                System.out.print(-1 + ", ");
                return;
            }
            System.out.print(root.data + ", ");
            preorderTrav(root.left);
            preorderTrav(root.right);
        }

        // Traversal using InOrder

        public static void inorderTrav(Node root) { // O(n)
            if (root == null) {
                System.out.print(-1 + ", ");
                return;
            }
            inorderTrav(root.left);
            System.out.print(root.data + ", ");
            inorderTrav(root.right);
        }

        // Traversal using PostOrder

        public static void postorderTrav(Node root) { // O(n)
            if (root == null) {
                System.out.print(-1 + ", ");
                return;
            }
            postorderTrav(root.left);
            postorderTrav(root.right);
            System.out.print(root.data + ", ");
        }

        // Traversal using LevelOrder

        public static void levelorderTrav(Node root) { // O(n)
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // Traversal using PreOrder
        tree.preorderTrav(root);
        System.out.println();
        // Traversal using PreOrder
        tree.inorderTrav(root);
        System.out.println();
        // Traversal using PreOrder
        tree.postorderTrav(root);
        System.out.println();
        // Traversal using LevelOrder
        System.out.println("Level Order Traversal");
        tree.levelorderTrav(root);
    }
}
