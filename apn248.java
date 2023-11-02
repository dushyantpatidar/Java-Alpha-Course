// Print in the rang between to no , k1 and k2 
public class apn248{
    static class Node{
        int data;
        Node left , right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    };
    public static Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        };

        if(root.data > val){
            // left subtree
            root.left = insert(root.left, val);
        }else{
            // right subtree
            root.right = insert(root.right, val);
        };

        return root ;
    };
    public static void in_order(Node root){
        if(root == null){
            return ;
        };

        in_order(root.left);
        System.out.print(root.data+" ");
        in_order(root.right);
    }

    public static void printInRange(Node root , int k1 ,int k2){
        if(root == null){
            return ;
        };
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1 , k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }else if(root.data < k1){
            printInRange(root.left, k1, k2);
        }else{
            printInRange(root.right, k1, k2);
        };
    }
    public static void main(String []args){
        int values [] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i = 0 ; i<values.length ; i++){
            root = insert(root, values[i]);
        };

        int start = 5 ;
        int end = 12 ;

        in_order(root);
        System.out.println();

        printInRange(root, start, end);
    }
}
