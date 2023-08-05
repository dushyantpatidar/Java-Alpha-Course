public class apn76 {
    public static void Hollow_Rohmus(int n ){
        for(int i = 1 ; i<=n;i++){
            // Spaces -----
            for(int j = 1 ; j<=(n-i); j++){
                System.out.print(" ");
            }

            // Stars -----
            for(int k = 1 ; k<=n;k++){
               if(i==1 || i==n || k == 1 || k== n){
                System.out.print("*");
               }
               else{
                System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Hollow_Rohmus(4);
    }
}
