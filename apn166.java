import java.util.ArrayList;
public class apn166 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int Max = list.get(0);
        for(int i = 0 ; i<list.size();i++){
            if(Max < list.get(i)){
                Max = list.get(i);
            };
        };
        System.out.println("Max in list is : "+Max);
    };
}
