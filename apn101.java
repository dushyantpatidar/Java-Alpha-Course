public class apn101 {
    public static void main(String[] args) {
        String s = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        if(s==s2){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }

        if(s==s3){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
        System.out.println(".........................");
        if(s.equals(s3)){
            System.out.println("Equal ' s are");
        }
        else{
            System.out.println("Not...");
        }
    }
}
