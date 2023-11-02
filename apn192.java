// LinkedList
// Zig Zag Linked List
public class apn192 {
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
    public static int size ;

    public void addFirst(int data){
        // step1 = Create a Node
        Node NewNode = new Node(data);
        size++;
        
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
        size++;

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
    public void printLL(){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.Next ;
        }
        System.out.println("null");

    }

    public void addMid(int idx , int data){
        Node nEwNode = new Node(data);
        size++;
        Node temp = head ;
        int i = 0 ;

        while(i<idx-1){
            temp = temp.Next;
            i++;
        };

        // i = idx-1 ; temp -> prev 
        nEwNode.Next = temp.Next ;
        temp.Next =  nEwNode ;
    }
    public void ZigZag(){
        // find mid 
        Node slow = head;
        Node fast = head.Next;
        while(fast != null && fast.Next != null){
            slow = slow.Next;
            fast = fast.Next.Next;
        };

        Node mid = slow;

        // reverse 2nd Half
        Node curr = mid.Next ;
        mid.Next = null;
        Node prev = null;
        Node next ;

        while(curr != null){
            next = curr.Next;
            curr.Next = prev;
            prev = curr ;
            curr = next ;
        }

        Node left = head;
        Node right = prev ;
        Node nextL , nextR;


        // alt merge _ Zig-Zag merge
        while(left != null && right != null){
            nextL = left.Next;
            left.Next = right;
            nextR = right.Next;
            right.Next = nextL;

            left = nextL;
            right = nextR;
        }

    }
    public static void main(String[] args) {
        apn192 ll = new apn192();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.printLL();
        ll.ZigZag();
        ll.printLL();
    };
}