import java.util.ArrayList;
class apn169{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(2);

        mainList.add(list1);
        mainList.add(list2);

        System.out.println(mainList);
        System.out.println(mainList.get(0)); // list k andar list h 
        System.out.println(mainList.get(1));


        System.out.println("------------Loop---------------");
        for(int i = 0 ; i<mainList.size(); i ++){
            ArrayList<Integer> currList = new ArrayList<>();
            currList = mainList.get(i);
            for(int j = 0 ; j<currList.size(); j++){
                System.out.print(currList.get(j));
            }
            System.out.println();
        }

    }
}
