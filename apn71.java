public class apn71 {
    public static void Pattern(int n){
        for(int i =1 ; i<=n ; i++){ // outer loop 

            for(int j = 1 ; j<=n-i+1; j++){ 
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern(4);
    }
}
