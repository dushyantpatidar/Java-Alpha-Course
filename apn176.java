// LinkList List // addFirst
public class apn176 {
    public static class Node{
        int data ;
        Node Next ;

        public Node(int data){
            this.data = data ;
            this.Next = null ; 
        }
    }

    public static Node head ;
    public static Node tail ;

    public void addFirst(int data){
        // step1 = Create a Node
        Node NewNode = new Node(data);
        
        if(head == null){ // if head is null 
            head = tail = NewNode ;
        };

        // step2 = NewNode = next 
        NewNode.Next = head ; // Link
        
        // step3 = head = NewNode
        head = NewNode ;
        
    }
    
    
    public static void main(String[] args) {
        apn176 nn = new apn176();
        nn.addFirst(1);
        nn.addFirst(2);
    }
}
