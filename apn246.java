// Search in a tree 
class apn246{
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
    public static boolean search(Node root , int key){ // 0(H)
        if(root == null){
            return false ;
        }
        if(root.data == key){
            return true;
        };
        if(root.data > key){
            // for left
            return search(root.left, key);
        }else{
            // for right
            return search(root.right, key);
        }
    }

    public static void in_order(Node root){
        if(root == null){
            return ;
        };

        in_order(root.left);
        System.out.print(root.data+" ");
        in_order(root.right);
    }
    public static void main(String []args){
        int values [] = { 5 , 1 , 3 , 4 , 2 , 7};
        Node root = null;

        for(int i = 0 ; i<values.length ; i++){
            root = insert(root, values[i]);
        };

        if(search(root, 1)){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        };
    }
}