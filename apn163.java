import java.util.ArrayList;
public class apn163 {
    public static void main(String[] args) {

        // ArrayList Boolean type ka data leta h 

        ArrayList<Integer> list = new ArrayList<>(); // for Int , we used integer
        ArrayList<Boolean> list2 = new ArrayList<>(); // for bool , we use boolean 
        ArrayList<Float> list3 = new ArrayList<>(); // for float , we use float
        ArrayList<String> list4 = new ArrayList<>(); // For string , we use string

        // add No. in list 
        list.add(1);// ArrayList-name.add();
        list.add(2); // time = 0(1); big o of 1 ;
        list.add(3);
        list.add(4);
        System.out.println(list);

        // add in direct specific index 
        list.add(3, 44);
        System.out.println("After at in middile : "+list);



        /* // get element 
        int a = list.get(2); // find element on spefic index
        System.out.println("Index a is : "+a); */



        //delete
        list.remove(2); // delete element from index 2 
        System.out.println("After deleted : "+list); 


        // Set element on spefic index 
        list.set(0, 25);
        System.out.println("after Set used : "+list);


        // contains , are used for find a element are store in array or no 
        // contains , return true or false
        System.out.println("Find 11 are store or not : "+list.contains(11));
    }
}
