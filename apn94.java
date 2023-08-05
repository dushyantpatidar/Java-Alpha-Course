import java.util.*;
public class apn94 {
    public static boolean SeaRch(int matrix[][],int key){
        for(int i =0; i<matrix.length;i++){
            for(int j = 0 ; j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("Key Found at : ("+i+","+j+")");
                    return true;
                }
            }
            System.out.println("Key is Not Found");
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
    

        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<n;i++){
            for(int j = 0 ; j<m;j++){
                System.out.println("Enter the Number : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output 
        for(int i =0; i<n;i++){
            for(int j = 0 ; j<n;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        int key = 4 ;
        SeaRch(matrix, key);
    }
}
