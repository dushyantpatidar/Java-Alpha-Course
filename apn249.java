// print a root to leaf all nodes 
import java.util.*;
public class apn249{
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
/*----------------------------------------------------------------------------------------- */

    public static void printRoot2leaf(Node root , ArrayList<Integer> path){
        if(root == null){
            return ;
        }

        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }

        printRoot2leaf(root.left, path);
        printRoot2leaf(root.right, path);
        path.remove(path.size()-1);
    }
    public static void printPath(ArrayList<Integer> path){
        for(int i = 0 ; i<path.size(); i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("N");
    }
    public static void main(String []args){
        int values [] = {8,5,3,6,10,11,14};
        Node root = null;

        for(int i = 0 ; i<values.length ; i++){
            root = insert(root, values[i]);
        };
        
        printRoot2leaf(root, new ArrayList<>());
    }
}
