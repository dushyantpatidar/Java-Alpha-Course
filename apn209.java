// implementing using Java-Collection-Framework
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
public class apn209 {
    public static void main(String[] args) {

        // Queue is a interface bcz we can't write new Queue<>();
        // but jo Queue ko implement krti h un class's ka object banate h 
        // 1. Linked list , 2. ArrayDeque , only class
        
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q1 = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        q1.add(4);
        q1.add(5);
        q1.add(6);

        while(!q.isEmpty() || !q1.isEmpty()){
            System.out.println(q.peek()+"---"+q1.peek());
            q.remove();
            q1.remove();
        }
    }
}
