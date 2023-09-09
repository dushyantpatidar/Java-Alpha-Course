public class apn159 {
    public static void FindPermutation(String str, String ans) {
        // Base Case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // recursion -- 0(n*n!)
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // abcde = ab + de = abde
            String NewStr = str.substring(0, i) + str.substring(i + 1, str.length());
            FindPermutation(NewStr, ans + curr);
        }
    };

    public static void main(String[] args) {
        String str = "abc";
        FindPermutation(str, "");
    }
}
