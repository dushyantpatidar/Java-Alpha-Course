public class apn84 {
    public static void SubArray(int number[]){
        int totalSubarray = 0 ;
        for(int i = 0 ; i<number.length;i++){//0,1
            int start = i ;
            for(int j = i ; j<number.length;j++){
                int end = j;
                for(int k = start ;k<=end; k++){
                    System.out.print(number[k]+" ");
                }
                totalSubarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub Array is : "+totalSubarray);
    }
    public static void main(String[] args){
        int number[] = {2,4,6,8,10};
        SubArray(number);
    };
};