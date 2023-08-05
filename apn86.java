public class apn86 {
    public static void SubArray(int number[]){
        int currSum = 0 ;
        int maxSum = 0;//Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

        prefix[0] = number[0];
        // Calculate the prefix array 
        for(int i = 1 ; i<prefix.length;i++){
            prefix[i] = prefix[i-1] + number[i];
        }


        for(int i = 0 ; i<number.length;i++){
            int start = i ;// 4
            for(int j = i ; j<number.length;j++){ // 4
                int end = j; // 4

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1] ;// 

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum is "+maxSum);
    }
    public static void main(String[] args){
        //int number[] = {1,4,-1,-7,9};
        int number[]={2,4,6,8,10};
        SubArray(number);
    };
};