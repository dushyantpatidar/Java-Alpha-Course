class apn79 {
    public static int linearSearch(int number[],int srch){
        for(int i = 0 ; i<number.length;i++){
            if(number[i]==srch){
                return i ;
            }
        } 
        return -1 ;
    }
    public static void main(String[] args) {
        // linear Search 
        int arr[] ={2,4,6,8,10,12,14,16};
        int key = 10;
        int index = linearSearch(arr, key);
        if(index ==-1){
            System.out.println("not Found");
        }else{
            System.out.println("Found at index "+index);
        };
    }
}
