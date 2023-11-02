// LinkList List 
// Deceting cycle/ loop or not 
public class apn188 {
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
    public static boolean isCycle(){
        Node slow = head ;
        Node fast = head ;

        while(fast != null && fast.Next !=null){
            slow = slow.Next;// +1
            fast = fast.Next.Next; //+2
            if(slow == fast){
                return true ; // Cycle exist
            };
        };

        return false ; // cycle don't exist 
    }
    public static void main(String[] args) {
        head = new Node(1);
        head.Next = new Node(2);
        head.Next.Next = new Node(3);
        head.Next.Next.Next = head;
        System.out.println(isCycle());

    };
}
