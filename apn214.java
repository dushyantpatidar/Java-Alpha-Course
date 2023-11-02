// Reverse The Queue
import java.util.*;
public class apn214 {
    public static void reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.push(q.remove());
        };

        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> Q = new LinkedList<>();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);

        reverse(Q);

        while(!Q.isEmpty()){
            System.out.print(Q.remove()+" ");
        };
        System.out.println();
    }
}
