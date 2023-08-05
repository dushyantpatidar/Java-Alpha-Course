import java.util.Scanner;
public class apn54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n = sc.nextInt();
        for(int Line = 1; Line<=n; Line++){
            for(int Star = 1 ; Star<=Line; Star++){
                System.out.print("*");
            };
            System.out.println();
        }
    }
}
