import java.util.Scanner;

public class apn6 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the two values");
       int a = sc.nextInt();
       int b = sc.nextInt();

       int sum = a+b;
       System.out.println("Sum is : "+sum);

       int product = a*b;
       System.out.println("Product is : "+product);
    }
}
