
import java.lang.reflect.Array;
import java.util.*;
public class apn92{
    public static void insertionSort(int arr[]){
        int i ;
        for(i = 1;i<arr.length;i++){
            int curr = arr[i] ;
            int prev = i-1;
            // Find the correct position to insert 
            while(prev>=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
        
            // insertion
            arr[prev+1] = curr;
            
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        // Sorting throw a function 
        int arr[] = {5,4,1,3,2};
        //Arrays.sort(arr);
        Arrays.sort(arr,0,3); // Index first : index last 
        //Arrays.sort(arr,Collection.reverseOrder()); Sort in reverse orded
        printArr(arr);
    }
}

