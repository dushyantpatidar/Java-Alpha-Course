public class apn109 {
    public static int getIntBit(int n , int i ){
        int bitmask = 1<<i;
        if((n&bitmask)==0){
            return 0 ;
        }
        else{
            return 1;
        }
    }
    public static int SetithBit(int n , int i ){
        int bitmask = 1<<i;
        return n|bitmask;
    }
    public static int clearIthBit(int n , int i ){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(getIntBit(10, 2));
        System.out.println(SetithBit(10, 3));
        System.out.println(clearIthBit(10, 1));
    }
}
