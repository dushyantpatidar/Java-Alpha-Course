// Stack using Java Collection framework
import java.util.Stack;
public class apn197 {
    public static void main(String[]args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        System.out.println(s.peek());

        s.push(2);
        System.out.println(s.peek());

        s.push(3);
        System.out.println(s.peek());
        
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
