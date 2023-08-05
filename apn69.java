public class apn69 {
    public static void holo_Rectangle(int totRows /* That mean i*/ , int totCols /* That means j */){
        // outer loop 
        for(int i = 1 ; i<=totRows; i++){
            // inner-loop
            for(int j = 1 ; j<=totCols; j++ ){
                // cell i=j
                if(i==1||i== totRows || j == 1 || j==totCols){
                    // boundry 
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
    holo_Rectangle(4,5);
   } 
}
