// use LinkedList In Java collection Framewokr
import java.util.LinkedList;
public class apn190 {
    public static void main(String[] args) {
        // Create
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addFirst(0);
        ll.addLast(1);
        ll.addLast(2);

        System.out.println(ll);

        // remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
