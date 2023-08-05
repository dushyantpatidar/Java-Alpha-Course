public class apn75 {
    public static void Rombus(int n ){
        for(int i = 1 ; i<=n;i++){

            for(int j = 1 ; j<=(n-i);j++){ // Spaces 
                System.out.print(" ");
            }

            for(int k = 1 ; k<=n ; k++){ // Stars 
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Rombus(3);
    }
}
