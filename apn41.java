import java.util.Scanner;
public class apn41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Two Number");
        int a = sc.nextInt();
        if(a%4==0){
            System.out.println("leap Year");
        }
        else{
            System.out.println("Non-Leap Year");
        };
    }
}
