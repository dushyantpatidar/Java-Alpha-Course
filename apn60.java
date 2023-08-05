import java.util.Scanner;
public class apn60 {
    public static void Sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No. ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum is : "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 1;
        while(c==1){
            Sum();
            System.out.println("For Continue 1 , For Break 0 ");
            c = sc.nextInt();
        }
    }
}
