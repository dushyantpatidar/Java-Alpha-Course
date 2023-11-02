// delete in a tree
class apn247{
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

    public static Node delete(Node root, int val){
        // find the node firstly
        if(root.data < val){
            root.right = delete(root.right, val);
        }else if(root.data > val){
            root.left = delete(root.left, val);
            // then |
        }else{// voila case
            // case 1 - leaf node
            if(root.left == null && root.right == null){
                return null;
            }

            // case 2 - single case
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            // case 3 - both children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        };
        return root;
    };

    public static Node findInorderSuccessor(Node root){
        while(root != null){
            root = root.left;
        };
        return root;
    }
    public static void main(String []args){
        int values [] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i = 0 ; i<values.length ; i++){
            root = insert(root, values[i]);
        };

        in_order(root);
        delete(root, 11);

        System.out.println("After Delete");
        in_order(root);
    }
}
