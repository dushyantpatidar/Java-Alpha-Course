import java.util.Scanner;
public class apn77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int marks [] = new int[100];
        marks[0] = sc.nextInt(); 
        marks[1] = sc.nextInt(); 
        marks[2] = sc.nextInt(); 

        System.out.println("Marks[0] is : "+marks[0]);
        System.out.println("Marks[1] is : "+marks[1]);
        System.out.println("Marks[2] is : "+marks[2]);

        marks[2] =200 ;
        System.out.println("After New Decalre : "+marks[2]);

        marks[1] = marks[1]+1;
        System.out.println("After New Declaration "+marks[1]);

        int prectage = marks[0]+marks[1]+marks[2]/3;
        System.out.println("Prectange is : "+prectage);

        System.out.println("Length of An Array : "+marks.length);
    }
}
