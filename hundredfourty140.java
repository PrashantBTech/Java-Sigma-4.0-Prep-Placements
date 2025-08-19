//  #  Binary Search Tree
// Build a BST
// Search in BST

// Delete a node in BST

public class hundredfourty140 {
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

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    // Search in BStree
    public static boolean Search(Node root, int key){ // O(H)
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            // left
            return Search(root.left, key);

        }else{
            return Search(root.right, key);
        }
    }

    // Delete a node in BST

    public static Node delete(Node root, int val){
        if (root.data < val) {
            root.right = delete(root.right, val);
        }
        else if (root.data > val) {
            root.left = delete(root.left, val);
        }else{
            // case1 : leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2: having single child
            if (root.left == null) {
                return root.right;
            }else if (root.right == null) {
                return root.left;
            }
            // case 3: having two child
            Node IS = findInorderSucessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node findInorderSucessor(Node root){
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }


    public static void main(String[] args) {
        // int values[] = { 5, 1, 3, 4, 2, 7 };
        
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insertBST(root, values[i]);
        }
        inorder(root);
        System.out.println();
        System.out.println("Found 4 : "+Search(root, 4));

        System.out.println( "Deleting a node 5: " );
        root = delete(root, 5);
        inorder(root);
    }
}
