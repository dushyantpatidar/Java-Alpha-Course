class Calculator{
    int sum(int a , int b ){
        return a+b;
    }
    double sum(double a , double b){
        return a + b;
    }
    int sum(int a, int b , int c){
        return a+b+c;
    }
}
public class apn118 {
    public static void main(String[] args) {
        Calculator calcu = new Calculator();
        System.out.println(calcu.sum(33,55));
        System.out.println(calcu.sum(3.5, 5.4));
        System.out.println(calcu.sum(44, 44));

    }
}
