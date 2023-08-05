import java.util.Scanner;
public class apn59 {
    public static void Sum(int c , int d ){
        int sum = c+d;
        System.out.println("Sum is : "+sum);
    }
     // Parameters are in Function 
    public static int Mul(int c , int d ){ //This is Parameters // formal parameters
        int Mul = c*d;
        return Mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No. ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Sum(a,b);
        // Arguments are define , when the call the function 
        int a2 = Mul(a,b); // this is argument // Actual Parameters 
        System.out.println(a2);
    }
}

