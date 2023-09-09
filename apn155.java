public class apn155{
    public static int allOucc(int arr[],int key , int i ){
        if(i==arr.length){
            return - 1 ;
        }
        if(arr[i] ==key){

            System.out.println(i);
            
        }
        return allOucc(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        allOucc(arr, 3, 0);
    }
}