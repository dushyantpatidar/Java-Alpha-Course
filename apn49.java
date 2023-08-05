import java.util.Scanner;
class apn49{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2 ; i<n; i++){
            if(n%i==0){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }

    }
}