import java.util.Scanner;
class apn5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.println("Enter the Name : ");
        //String name = sc.next(); // Only print a single word , not print a holl line
        //System.out.println("Name 1st is : "+name);

        System.out.println("Enter the Name..2 : ");
        String name2 = sc.nextLine(); // Print the holl lines , or paragraph
        System.out.println("Name 2nd is : "+name2);

        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("NUmber is : "+n);

        System.out.println("Enter the Float: ");
        float f = sc.nextFloat();
        System.out.println("Float is : "+f);

    }
}