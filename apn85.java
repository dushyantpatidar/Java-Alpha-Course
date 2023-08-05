public class apn85 {
    public static void SubArray(int number[]){
        int currSum = 0 ;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i<number.length;i++){//0,1
            int start = i ;
            for(int j = i ; j<number.length;j++){
                int end = j;
                currSum = 0 ;
                for(int k = start ;k<=end; k++){
                    //currSum+=number[k];
                    currSum = currSum + number[k];
                }
                System.out.println("Current Sum is "+currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max Sum is "+maxSum);
    }
    public static void main(String[] args){
        //int number[] = {1,4,-1,-7,9};
        int number[]={2,4,6,8,10};
        SubArray(number);
    };
};