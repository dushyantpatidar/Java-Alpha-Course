// LinkList List 
//Remove from nth node 
public class apn186 {
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

    public void deleteNthFromEnd(int n){
        // Calculate size 
        int sz = 0 ;
        Node temp = head ;
        while(temp != null){
            temp = temp.Next ;
            sz++;
        };

        if(sz == n){
            head = head.Next; // remove First
            return ;
        };

        // sz-n
        int i = 1 ;
        int iToFind = sz-n;
        Node prev = head ;
        while(i < iToFind){
            prev = prev.Next ;
            i++;
        }
        prev.Next = prev.Next.Next;
        return ; 
    }
    public static void main(String[] args) {
        apn186 LinkListList = new apn186();

        LinkListList.addFirst(2);
        LinkListList.addFirst(1);
        LinkListList.addLast(4);
        LinkListList.addLast(5);
        LinkListList.addMid(2, 3);

        LinkListList.printLL();
        LinkListList.deleteNthFromEnd(3);
        LinkListList.printLL();
        
    }
}
