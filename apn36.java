import java.util.Scanner;
public class apn36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Two Number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the Operation You perform");
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+' : System.out.println(a+b); 
            break;
            case '-' : System.out.println(a-b); 
            break;
            case '/' : System.out.println(a/b); 
            break;
            case '*' : System.out.println(a*b); 
            break;
            case '%' : System.out.println(a%b); 
            break;
            default : System.out.println("Wrong Method");
        }
    }
}
