public class apn96 {
    //public static int diagonalSum(int martix[][]){ time complixity is high
    //    int sum = 0 ;
    //    for(int i = 0 ; i<martix.length;i++){
    //        for(int j = 0 ; j<martix[0].length;j++ ){
    //            if(i==j){
    //                sum = sum + martix[i][j];
    //            }
    //            else if ( i+j == martix.length-1){
    //                sum = sum + martix[i][j];
    //            }
    //        }
    //    }
    //    return sum ;
    //}
    public static int diagonalSum2(int martix[][]){ // faster then the upersside 
        int sum = 0 ;
        for(int i = 0 ; i<martix.length;i++){
            // pd 
            sum = sum + martix[i][i];
            // sd 
            sum = sum + martix[i][martix.length-i-1];
        }
        return sum ;
    }
    public static void main(String[] args) {
         int martix[][] ={
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}};   
        //System.out.println(diagonalSum(martix));
        System.out.println(diagonalSum2(martix));
    }
}
