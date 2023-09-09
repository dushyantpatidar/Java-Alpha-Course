public class apn143 {
    public static void printArr(int arr[]){
        for(int i =0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        };
        System.out.println();
    }

    public static void mergeSort(int arr[], int si , int ei){
        if(si >= ei){
            System.out.println("Return");
            return;
        };

        //kaam
        int mid = (si+ei)/2; // si+(ei-si)/2; same as 

        System.out.println("Mergesort        left part calling");
        mergeSort(arr, si, mid);// left part

        System.out.println("Mergesort        Right part calling");
        mergeSort(arr, mid+1, ei); // Right part 

        System.out.println("Merge is calling");
        merge(arr,si,mid , ei); 

        System.out.println("End........of MergeSort");
    }

    public static void merge(int arr[],int si , int mid , int ei){

        int temp[] = new int[ei-si+1];
        int i = si;// iterator for left part 
        int j = mid+1;// interator for right part 
        int k = 0 ; // iterator for temp arr

        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                System.out.println("While if calling and temp["+k+"] is : "+temp[k]);
                i++;
            }else{
                temp[k] = arr[j];
                System.out.println("While else calling and temp["+k+"] is : "+temp[k]);
                j++;
            }
            k++;
        }


        // left part 
        while(i <= mid){ 
            temp[k] = arr[i];
            System.out.println("left part is calling temp["+k+"] is :"+temp[k]);
            k++;
            i++;
        };
        // Right part 
        while(j <= ei){
            temp[k] = arr[j];
            System.out.println("Right part is calling temp["+k+"] is :"+temp[k]);
            k++;
            j++;
        };

        // copy temp to original arr
        for(k = 0 , i=si; k<temp.length; k++,i++){
            arr[i] = temp[k];
            System.out.println("Copy temp original is arr["+i+"] is : "+arr[i]);
        }
        System.out.println("End.........of ........Merge");
    };

    public static void main(String[] args) {
        //int arr[] = {6,3,9,5,2,8};
        int arr[] = {6,3,9,5};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
