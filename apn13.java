import java.util.Scanner;
public class apn13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Three Number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int avg = (a+b+c)/3;
        System.out.println("The Avg is : "+avg);
    }
}
