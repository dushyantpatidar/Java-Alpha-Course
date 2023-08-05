import java.util.Scanner;
public class apn67 {
    public static void Avg(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = (a+b+c)/3;
        System.out.println("Average is : "+avg);
    }
    public static void main(String[] args) {
        Avg();
    }
}
