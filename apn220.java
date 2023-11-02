// Min absoluate Difference Pairs
//Given two Array And B equal Lenght N . pair each element of aay a to an lement in array B 
// such that sum S of absolute difference of all the pairs is minimum
import java.util.*;
public class apn220 {
    public static void main(String[] args) { // 0(n)
        int A[] = {4,1,8,7};
        int B[] = {2,3,6,5};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;
        for(int i = 0 ; i<A.length; i++){
            minDiff = minDiff + (A[i] > B[i] ? A[i] - B[i] : B[i] - A[i]);
            //minDiff = minDiff + Math.abs(A[i]-B[i]);
        }

        System.out.println("Min Absolute diff of pairs = "+minDiff);
    }
}
