public class apn140 {
    public static int friendPairing(int n){
        if( n ==1 || n==2){
            return n;
        };

//        // choice 
//        // Single
//        int fnm1 = friendPairing(n-1);
//
//        // Pair
//        int fnm2 = friendPairing(n-2);
//        int pairWays = (n-1) * fnm2;
//
//        // totWays
//        int totWays = fnm1 + pairWays;
//        return totWays;

        return friendPairing(n-1) + (n-1) * friendPairing(n-2); // uper vala or ye same h 
    }
    public static void main(String[] args) {
        System.out.println(friendPairing(5));
    }
}
