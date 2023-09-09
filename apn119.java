class AnimAl{
    void eat(){
        System.out.println("eats Anything");
    }
}
class Deer extends AnimAl{
    void eat(){
        System.out.println("eats grass");
    }
}
public class apn119 {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}
