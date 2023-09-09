import java.util.ArrayList;
public class apn164 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(); // for Int , we used integer

        // add No. in list 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.size()); // print the total lenght of arraylist / size 

        for(int i = 0 ; i<list.size(); i ++){
            System.out.print(list.get(i));
        }
       System.out.println();
    }
}
