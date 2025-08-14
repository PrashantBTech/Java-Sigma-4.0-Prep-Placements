// Minimum Distance between two nodes in Binary tree  (Counting Edges)
// Using LCA code
// O(n)
public class hundredthirtysevev137 {
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

    public static Node lca2(Node root, int n1, int n2){
        if (root == null || root.data == n1 || root.data == n2 ) {
            return root;
        }
        Node leftLca =  lca2(root.left, n1, n2);
        Node rightLca =lca2(root.right, n1, n2);

        if (rightLca == null) {
            return leftLca;
        }
        if (leftLca == null) {
            return rightLca;
        }

        return root;
    }

     public static int lcaDist(Node root , int n){
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }
        else if (leftDist == -1) {
            return rightDist + 1;

        }else
        {
            return leftDist + 1;
        }
     }

    public static int minDst(Node root , int n1, int n2){
        Node lca = lca2(root, n1, n2);
        int dis1 = lcaDist(lca, n1);
        int dis2 = lcaDist(lca, n2);

        return dis1+dis2;

    } 

    
    public static void main(String[] args) {
        /*
         * 1 level =1
         * / \
         * 2  3   level=2
         * / \ /\
         * 4 5 6 7 level =3
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
       
        System.out.println("Edges Distance: "+minDst(root, 4, 6));

    }
}
