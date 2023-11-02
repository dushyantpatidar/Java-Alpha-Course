// LinkList List 
// Cheak if LinkedList is Palindrome or not 
public class apn187 {
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

    public Node findMidNode(Node head){
        Node slow = head;
        Node fast = head ;

        while(fast != null && fast.Next != null){
            slow = slow.Next;
            fast = fast.Next.Next;
        };
        return slow ;
    };

    public boolean cheakPalindrome(){
        if(head == null || head.Next == null){
            return true ;
        }
        // step1 - find mid 
        Node mid = findMidNode(head);

        // step2 - Reverse 2nd Half 
        Node curr = mid;
        Node prev = null;
        while(curr != null){
            Node next = curr.Next ;
            curr.Next = prev ;
            prev = curr ;
            curr = next ;
        };
        Node right = prev ;
        Node left = head ;

        // cheak if equal
        while(right != null){
            if(left.data != right.data){
                return false ;
            }
            left = left.Next;
            right = right.Next;
        };

        return true;
    }
    public static void main(String[] args) {
        apn187 LinkListList = new apn187();
        LinkListList.addLast(1);
        LinkListList.addLast(2);
        LinkListList.addLast(2);
        LinkListList.addLast(1);
        LinkListList.printLL();
        System.out.println(LinkListList.cheakPalindrome());
    };
}
