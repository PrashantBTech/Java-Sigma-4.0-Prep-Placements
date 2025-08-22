// Validate BST
// Important

import java.util.ArrayList;

public class hundredfourtythree143 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

        }
    }

    public static Node insertBST(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            // left subtree
            root.left = insertBST(root.left, val);
        } else {
            root.right = insertBST(root.right, val);
        }
        return root;
    }
    
    public static boolean isValidBst(Node root, Node min , Node max ){
        if(root == null){
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        }
        else if (max != null && root.data >= max.data) {
            return false;
        }
        return isValidBst(root.left, min, root) && isValidBst(root.right, root, max);

    }
     public static void main(String[] args) {
        // int values[] = { 5, 1, 3, 4, 2, 7 };

        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insertBST(root, values[i]);
        }
       if (isValidBst(root, null, null)) {
         System.out.println("True , VAlid");
       }else{
        System.out.println("False, not valid");
       }
    }
}
