// Greedy Algo Start 
// find max-Activities do a person w, given start and end time of activites 
import java.util.*;
public class apn218 {
    public static void FindActivities(){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        // end time basis sorted
        int maxAct = 0 ;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st activity
        maxAct = 1 ;
        ans.add(0);
        int lastEnd = end[0];
        for(int i = 1 ; i<end.length; i++){
            if(start[i] >= lastEnd){
                // activity select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        
        System.out.println("Max Activities : "+maxAct);
        for(int i = 0 ; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }

    public static void FindActivities_2(){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        // sorting 
        int Activities[][] = new int[start.length][3];
        for(int i = 0 ; i<start.length; i++){
            Activities[i][0] = i ;
            Activities[i][1] = start[i];
            Activities[i][2] = end[i];
        }

        // lambda function -> shortform 
        Arrays.sort(Activities , Comparator.comparingDouble(o -> o[2]));
        for(int i = 0 ; i<start.length;i++){
            for(int j = 0 ; j<3;j++){
                System.out.print(Activities[i][j]);
            }
            System.out.println();
        }

        // end time basis sorted
        int maxAct = 0 ;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st activities 
        maxAct = 1 ;
        ans.add(Activities[0][0]);
        int lastEnd = Activities[0][2];

        for(int i =0; i<end.length; i++){
            if(Activities[i][1] >= lastEnd){
                //Activity select
                maxAct++;
                ans.add(Activities[i][0]);
                lastEnd = Activities[i][2];
            }
        }

        System.out.println("Max Activities : "+maxAct);
        for(int i = 0 ; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        // Find activities with Sorted the activites in End/Start , esme sorted thi already
        FindActivities();
        
        System.out.println();

        // firstly sort the activities and then find , esme sorted in thi sort kri h 
        FindActivities_2(); 

    }
}
