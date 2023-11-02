// k_th Ancestor of Node
import java.util.*;
public class apn242 {
    static class Node{
        int data;
        Node left , right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    };

    public static int K_Ancestor(Node root, int n , int k ){
        if(root == null){
            return -1;
        };
        if(root.data ==n){
            return 0 ;
        };

        int leftDist = K_Ancestor(root.left, n, k);
        int rightDist = K_Ancestor(root.right, n, k);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }
        int max = Math.max(leftDist , rightDist);

        if(max +1 == k){
            System.out.println(root.data);
        }
        return max +1;
    }
    public static void main(String[] args) {
        /*
                    1
                   / \
                  2   3
                 /\   /\
                4  5 6  7
                         \
                          11
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.right = new Node(11);

        int n = 11 , k = 1;
        K_Ancestor(root, n, k);
        
    }
}
