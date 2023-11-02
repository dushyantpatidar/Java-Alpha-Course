// Double LInkedList 
public class apn193{
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
    public static void main(String []args){
        apn193 DoubleLL = new apn193();
        DoubleLL.addFirst(0);
        DoubleLL.addFirst(1);
        DoubleLL.addFirst(2);
        DoubleLL.addFirst(3);
        DoubleLL.printLL();
        DoubleLL.removeFirst();
        DoubleLL.printLL();
    }
}