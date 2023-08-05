public class apn62 {
    public static void Factorial(int n ){
        int f = 1 ;
        for(int i = 1 ; i<=n; i++){
            f = f*i;
        }
        System.out.println("Factorial Is : "+f);
    }
    public static void main(String[] args) {
        Factorial(4);
    }
}
