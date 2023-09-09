// Backtraking ----------------------------
public class apn157 {
    public static void ChnageArr(int arr[] , int i , int val){
        // base case 
        if(i == arr.length){
            printArr(arr);
            return;
        }

        // recursion
        arr[i] = val;
        ChnageArr(arr, i+1, val+1); // fun call 
        arr[i] = arr[i] - 2; // backtraking 

    }
    public static void printArr(int arr[]){
        for(int i = 0 ; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        ChnageArr(arr, 0, 1);
        printArr(arr);
    }
}
