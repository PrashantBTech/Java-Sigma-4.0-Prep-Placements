// Convert BST to Balanced BST 

import java.util.ArrayList;

public class hundredfourtysix146 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }


    public static Node createBST (ArrayList<Integer> arr, int st , int end){  // O(n)
       if (st > end) {
        return null;
       }
        int mid = (st + end)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
    }

    public static void Getinorder(Node root, ArrayList<Integer>list){
        if (root == null) {
            return;
        }
        Getinorder(root.left, list);
        list.add(root.data);
        Getinorder(root.right, list);

    }


    public static Node getBalBST(Node root){  // O(n)
        // Inorder
        ArrayList<Integer> Inorder = new ArrayList<>();
        Getinorder(root, Inorder);
        // balanced bst
       root = createBST(Inorder, 0, Inorder.size()-1);
       return root;
    }

    public static void main(String[] args) {
        /*
         *    8
         * 6,   ,10
         * 5,   ,11
         * 3.   .12
         */
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        root = getBalBST(root);
        preorder(root);
        
    }
}
