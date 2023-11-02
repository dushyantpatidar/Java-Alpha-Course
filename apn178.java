// LinkList List // Print LinkedList 
public class apn178 {
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
            return ;
        };

        // step2 = NewNode = next 
        NewNode.Next = head ; // Link
        
        // step3 = head = NewNode
        head = NewNode ;
        
    }
    
    public void addLast(int data){
        // step1 = Create a Node 
        Node newNode = new Node(data);

        // if head is null
        if(head == null){
            head = tail = newNode ;
            return ;
        }

        // step2 = tail = newNode
        tail.Next = newNode; // link

        // step3 = tail = newNode 
        tail = newNode ;
    }

    public static void printLL(){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.Next ;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        apn178 nn = new apn178();
        printLL();
        nn.addFirst(2);
        printLL();
        nn.addFirst(1);
        printLL();
        nn.addLast(3);
        printLL();
        nn.addLast(4);
        printLL();
    }
}
