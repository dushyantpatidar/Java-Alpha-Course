public class apn65 {
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i = 2 ; i<n;i++ ){
            if(n%i==0){
                isPrime = false;
            }
        }
        return isPrime;
    }
    public static void PrimeInRange(int n ){
        for(int i = 2 ; i<n; i++){
            if(isPrime(i)){
                System.out.println("Prime No. "+i);
            }
        }
    }
    public static void main(String[] args) {
        PrimeInRange(5);
    }
}
