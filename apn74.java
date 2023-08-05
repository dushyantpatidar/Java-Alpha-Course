public class apn74 {
    public static void Butterfly(int n ){
        // 1st Half 
        for(int i = 1;i<=n;i++){
            // stars -- 
            for(int j = 1 ; j<=i; j++){
                System.out.print("*");
            }

            // Spaces 
            for(int k = 1 ; k<=(2*(n-i)); k++){
                System.out.print(" ");
            }

            // stars 
            for(int L = 1 ; L<=i ; L++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd Half 
        for(int i =n ; i>=1; i--){
            // stars -- 
            for(int j = 1 ; j<=i; j++){
                System.out.print("*");
            }

            // Spaces 
            for(int k = 1 ; k<=(2*(n-i)); k++){
                System.out.print(" ");
            }

            // stars 
            for(int L = 1 ; L<=i ; L++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Butterfly(3);
    }
}
