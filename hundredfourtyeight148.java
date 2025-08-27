// Merge two BSTs in a Single Balanced BST

import java.util.ArrayList;

public class hundredfourtyeight148 {
     static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static void inorder(Node root , ArrayList<Integer> list){
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }
    public static Node createBST( ArrayList<Integer> arr, int st, int end){
       if (st>end) {
        return null;
       }
        int mid = (st+end)/2;
        Node root = new Node(arr.get(mid));
       root.left = createBST(arr, st, mid-1);
       root.right = createBST(arr, mid+1, end);
       return root;
    }
    public static Node mergeBSTs(Node root1, Node root2){ // O(n+m) -> linear
        // step 1
        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();
        inorder(root1, list1);
        inorder(root2, list2);
        // merge
        int i=0; int j=0;
        ArrayList<Integer>finalArr = new ArrayList<>();
        while (i<list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                finalArr.add(list1.get(i));
                i++;
            }else{
                finalArr.add(list2.get(j));
                j++;
            }
        }
        while (i < list1.size()) {
            finalArr.add(list1.get(i));
            i++;
        }
          while (j < list2.size()) {
            finalArr.add(list2.get(j));
            j++;
        }
        // sorted AL to BST
       return createBST(finalArr, 0, finalArr.size()-1);
    }

     public static void preorder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
     }

    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBSTs(root1, root2);
        preorder(root);
        /*
         *     3
         *     /\
         *     1 9
         *     \  /\
         *      2 4 12
         */
    }

}
