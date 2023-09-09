public class apn156 {
    static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void printdigits(int number){
        if(number==0){
            return;
        }

        int lastDigit = number%10;
        printdigits(number/10);
        System.out.println(digits[lastDigit]+" ");
    }
    public static void main(String[] args) {
        printdigits(7232);
        System.out.println("");
    }
}
