public class apn106 {
    public static String compress(String str) {

        String newStr = "";
        // aaabc

        for (int i = 0; i < str.length(); i++) {            
            Integer count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            
            newStr = newStr + str.charAt(i);
            
            if (count > 1) {
                newStr = newStr + count.toString();
            }

        }
        return newStr;
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println("Compressed String " + compress(str));
    }
}
