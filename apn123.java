class Animal1{
    String color;
    Animal1(){
        System.out.println("Animal constructor is called");
    }
}

class Horse1 extends Animal1{
    Horse1(){
        super();
        super.color = "Brown";
        System.out.println("horse constructor is called ");
    }
}
public class apn123 {
    public static void main(String[] args) {
        Horse1 h = new Horse1();
        System.out.println(h.color);
    }
}
