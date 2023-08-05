
public class apn63 {
    // Function overloading using parameters
    public static int sum(int a , int b ){
        return a+b;
    }
    public static int sum(int a , int b ,int c ){
        return a+b+c;
    }

    // Function overloading using Datatypes
    public static int Mul(int a , int b ){
        return a*b;
    }
    public static float Mul( Float a , Float b ,Float c ){
        return a*b*c;
    }
    public static void main(String[] args) {
        int a = sum(5, 7, 7);
        System.out.println("");
        int b =sum(11, 11);
        System.out.println(a);
        System.out.println(b);


        float c = Mul(2f,3f,2f);
        int d = Mul(5, 6);
        System.out.println(c);
        System.out.println(d);


    }
}
