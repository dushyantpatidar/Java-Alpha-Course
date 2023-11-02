// LinkedList
// merged sort 
public class apn191 {
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
    public Node mereSort(Node head){
        if(head == null || head.Next == null){
            return head;
        };

        // find mid 
        Node mid = getMid(head);

        // left & right MS
        Node rightHead = mid.Next;
        mid.Next = null;
        Node newLeft = mereSort(head);
        Node newRight = mereSort(rightHead);

        // merege
        return merge(newLeft , newRight);

    };
    public Node getMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.Next ==null){
            slow = slow.Next;
            fast = fast.Next.Next;
        }

        return slow;// mid 
    }
    public Node merge(Node head1 , Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.Next = head1;
                head1 = head1.Next;
                temp = temp.Next;
            }else{
                temp.Next = head2;
                head2 = head2.Next;
                temp = temp.Next;
            }
        }

        while(head1 != null){
            temp.Next = head1;
            head1 = head1.Next;
            temp = temp.Next;
        };

        while(head2 != null){
            temp.Next = head2;
            head2 = head2.Next;
            temp = temp.Next ;
        };

        return mergedLL.Next;
    };
    public static void main(String[] args) {
        apn191 ll = new apn191();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.printLL();
        ll.head = ll.mereSort(ll.head);
        ll.printLL();
    };
}