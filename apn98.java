import java.util.Scanner;
class apn98{
    public static void printletter(String str){
        for(int i = 0 ; i <str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz");

        // Strings are Immutable 
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); // For single work 
        String name2 = sc.nextLine();

        System.out.println(name);
        System.out.println(name2);
        String Name = "Dushyant Patidar";

        // lenght of a string
        System.out.println(Name.length());

        // Concatenate 
        String FirstName = "Disha";
        String LastName = "Paliwal";
        String FullName = FirstName +" " + LastName;
        System.out.println(FullName);
        
        
        // CharAt = find specific element of string
        System.out.println(FullName.charAt(7));
        printletter("Letter At index 7 is : "+FullName);
    }
}