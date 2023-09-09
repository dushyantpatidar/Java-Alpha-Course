public class apn139 {
    public static void removeDuplicates(String str , int idx , StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return ;
        }

        // kaam 
        char currChar = str.charAt(idx);
        if(map[currChar -'a'] == true){

            System.out.println(map[currChar -'a']+" ");
            //duplicate
            removeDuplicates(str, idx+1, newStr, map);
        }else{
            System.out.println("False");
            
            map[currChar-'a'] = true;
            removeDuplicates(str, idx, newStr.append(currChar), map);
        }

    }
    public static void main(String[] args) {
        String str = "appnanacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
