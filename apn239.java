// Lowest Common Ancestor 
// Approach 1st
import java.util.*;
public class apn239 {
    static class Node{
        int data;
        Node left , right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    };

    public static boolean GetPath(Node root , int n , ArrayList<Node> path){
        if(root == null){
            return false;
        };

        path.add(root);

        if(root.data == n){
            return true ;
        };

        boolean foundLeft = GetPath(root.left , n , path);
        boolean foundRight = GetPath(root.right, n, path);

        if(foundLeft || foundRight){
            return true ;
        };

        path.remove(path.size()-1);
        return false;
    };

    public static Node LCA(Node root  ,int n1 , int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        GetPath(root, n1, path1);
        GetPath(root, n2, path2);

        // Last Common ancestor
        int i = 0 ;
        for(; i<path1.size() && i<path2.size();i++){
            if(path1.get(i) != path2.get(i)){
                break ;
            }
        };

        // last equal Node -> i-1th
        Node LCA = path1.get(i-1);
        return LCA ;
    }


    public static void main(String[] args) {
        /*
                    1
                   / \
                  2   3
                 /\   /\
                4  5 6  7
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4 , n2 = 5 ;
        System.out.print(LCA(root, n1, n2).data);
    }
}
