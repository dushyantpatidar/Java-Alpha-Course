public class apn81 {
    public static int BinarySearch(int number[],int key ){
        int start = 0  ;
        int end =  number.length-1 ;
        while(start<=end){
            int mid = (start+end)/2;

            // Comparisons 
            if(number[mid] == key){
                return mid; // Found 
            };

            if(number[mid]<key){ // Right 
                start = mid+1;
            }
            else{ // Left 
                end = mid - 1 ;
            }
        };
        return -1 ;
    }
    public static void main(String[] args) {
        int Number[] = {11,24,27,28,29,31,35,40};
        int key =  31; 
        System.out.println("Index of key is : "+BinarySearch(Number, key));

    }
}
