import java.util.Scanner;
public class apn30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Income : ");
        double income = sc.nextInt();
        double tax ;
        if(income < 500000) {
            tax = 0 ;
        }
        else if ( income > 500000 && income <1000000){
            tax = 0.2*income;
        }
        else{
            tax = 0.3*income;
        }
        System.out.println("Your Tax is "+ tax);
    }
}
