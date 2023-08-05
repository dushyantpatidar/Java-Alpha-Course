import java.util.Scanner;
public class apn15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Side : ");
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();

        float TotalCost = pen+pencil+eraser;
        float GstCost = TotalCost*18/100;
        float total = GstCost+TotalCost;
        System.out.println("Total Cost With Gst : "+total);   
    }
}