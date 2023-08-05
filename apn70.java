public class apn70 {
    public static void inverted_rorated_half_pyramid(int n ){
        // outer loop 
        for(int i = 1 ; i<=n; i++){

            // inner loop  for Spaces 
            for(int j = 1 ; j<=n-i; j++){

                System.out.print(" ");
            }

            // For Star 
            for(int k = 1 ; k<=i; k++){

                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_rorated_half_pyramid(4);
    }
}
