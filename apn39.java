import java.util.Scanner;
public class apn39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Day");
        int a = sc.nextInt();
        switch(a){
            case 1 : System.out.println("Sunday"); 
            break;
            case 2 : System.out.println("Monday"); 
            break;
            case 3 : System.out.println("Tuesday"); 
            break;
            case 4 : System.out.println("Wedesday"); 
            break;
            case 5 : System.out.println("Thrusday"); 
            break;
            case 6 : System.out.println("Friday"); 
            break;
            case 7 : System.out.println("Saturday"); 
            break;
            default : System.out.println("Wrong Method");
        }
    }
}
