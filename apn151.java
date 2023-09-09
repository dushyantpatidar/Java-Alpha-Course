public class apn151 {
    public static void FindArr(int arr[][],int key){
        int count = 0 ;
        for(int i = 0 ; i<arr.length;i++){
            for(int j = 0 ; j<arr[0].length;j++){
                if(arr[i][j]==key){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int arr[][] = {{4,7,8},{8,8,7}};
        int key = 7 ;
        FindArr(arr, key);
    }
}
