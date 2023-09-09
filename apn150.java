public class apn150 {
    public static void SSot(int arr[]){
        int temp ;

        for(int i = 0; i<arr.length-1 ; i++){

            for(int j = i ; j<arr.length; j++){

                //swap
                if(arr[i] > arr[j]){

                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        SSot(arr);
        printArr(arr);
    }
}
