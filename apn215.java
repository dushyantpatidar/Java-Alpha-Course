// Implementing Deque using Java-Collection-Framework
import java.util.Deque;
import java.util.LinkedList;
public class apn215 {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(1);
        d.addFirst(2);
        d.addLast(4);
        d.addLast(3);
        System.out.println(d);
        d.removeFirst();
        d.removeLast();
        System.out.println(d);

        System.out.println("1st element : "+d.getFirst());
        System.out.println("Last element : "+d.getLast());
    }
}
