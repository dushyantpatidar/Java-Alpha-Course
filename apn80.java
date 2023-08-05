public class apn80 {
    public static int bigestNumber(int arr[]){
        int largest = arr[0];//Integer.MIN_VALUE; // Assine the minmum value 
        int Smallest = arr[0];//Integer.MAX_VALUE; // Assine the Maximum value 
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            if(arr[i]<Smallest){
                Smallest = arr[i];
            }
        }
        System.out.println("Smallest is "+Smallest);
        //System.out.println("Largest is : "+largest);
        return largest;
    }
    public static void main(String[] args) {
        int n[] = {2,4,1,9,4};
        //bigestNumber(n);
        System.out.println("Largest is : "+bigestNumber(n));
    }
}
