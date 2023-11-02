// Duplicate Parentheses
// ((a+b) + (b+b))  false
// (((a)+(a+b))) True
import java.util.*;
public class apn204 {
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            // closing
            if(ch == ')'){
                int count = 0 ;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true ; // dupicate
                }
                else{
                    s.pop(); // opening pair
                };
            }
            else{
                // Opening
                s.push(ch);
            }
        };

        return false ; 
    }
    public static void main(String[] args) {
        // Valid String 
        String str = "((a+b))"; // true
        String str2 = "(a-b)"; // False
        System.out.println(isDuplicate(str));
    }
}
