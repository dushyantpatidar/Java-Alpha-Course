public class apn104 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(""); // to convert any type to String
        for(char ch = 'a'; ch<='z';ch++){
            sb.append(ch);
            //abcdefghijklmnopqrstuvwxyz
            System.out.println(sb.length());
        }
    }
}
