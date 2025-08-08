// Diameter of Tree : no of nodes in the longest path between 2 leaves
//      Approach Number : 1  in O(N^2) , Not recommended
//      Approach Number : 2  in  O(N)

public class hundredthirtyone131 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        // height
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    // Approach 1:

    public static int diameterAppr1(Node root) { // O(n^2)
        if (root == null) {
            return 0;
        }
        int leftDiam = diameterAppr1(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameterAppr1(root.right);
        int rightHt = height(root.right);

        int selfDiam = leftHt + rightHt + 1; // through me(root node)

        return Math.max(selfDiam, Math.max(rightDiam, leftDiam));
    }

    // Approach 2 :

    static class Info {
        int diam, ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameterAppr2(Node root){
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameterAppr2(root.left);
        Info rightInfo = diameterAppr2(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam),  leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;

        return new Info(diam, ht);
    }

    public static void main(String[] args) {
        /*
         * 1
         * /\
         * 2 3
         * /\ /\
         * 4 5 6 7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameterAppr1(root));
        System.out.println(diameterAppr2(root).diam);

    }
}
