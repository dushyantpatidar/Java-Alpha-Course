import java.util.*;
public class apn78 {
    public static void Marks(int marks[]){
        for(int i = 0 ; i<=marks.length; i++){
            marks[i] = marks[i]+i;
        }
    };
    public static void main(String[] args) {
        int marks[] = {11,22,44};
        //Marks(marks);

        marks[0] = marks[0]+11;
    
        // Print the ...
        for(int k = 0 ; k<=marks.length; k++){
            System.out.println(marks[k]+" ");
        }
    }
}
