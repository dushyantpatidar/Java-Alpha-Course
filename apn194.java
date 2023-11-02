// Double LInkedList 
// Reverse a Linked list 
public class apn194{
    public class Node {
        int data;
        Node next ;
        Node prev ;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node NodeFirst = new Node(data);
        if(head == null){
            head = tail = NodeFirst;
            return ;
        }
        NodeFirst.next = head;
        head.prev = NodeFirst;
        head = NodeFirst; 
    };

    public int removeFirst(){
        if(head == null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE ;
        }
        if(size == 1){
            int val = head.data ;
            head = tail = null ;
            size --;
            return val;
        };

        int val = head.data ;
        head = head.next ;
        head.prev = null ;
        size--;
        return val ;
    }
    public void printLL(){
        Node temp ;
        temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void Reverse(){
        Node curr = head ;
        Node prev = null;
        Node next;

        while(curr != null){
            next  = curr.next;
            curr.next = prev ;
            curr.prev = next ;

            prev = curr ;
            curr = next ;
        };
        head = prev ;
    };
    public static void main(String []args){
        apn194 DoubleLL = new apn194();
        DoubleLL.addFirst(0);
        DoubleLL.addFirst(1);
        DoubleLL.addFirst(2);
        DoubleLL.addFirst(3);
        DoubleLL.printLL();
        DoubleLL.Reverse();
        DoubleLL.printLL();
    }
}