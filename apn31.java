import java.util.Scanner;
class apn31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 No. ");
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        if(a>=b && a>=c ){
            System.out.println("is Biggest "+a);
        }
        else if (b>=a && b>=c){
            System.out.println(" is Biggest "+b);
        }
        else{
            System.out.println("is Biggest "+c);
        };
    }
}