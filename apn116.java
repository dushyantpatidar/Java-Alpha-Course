class ANimal{
    String color;

    void eat(){
        System.out.println("Eat");
    }

    void breathe(){
        System.out.println("Breathes");
    }
}
class Mammals extends ANimal{
    int legs ;

}
class Dog extends Mammals{
    String breed;
}
public class apn116 {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4 ;
        System.out.println(dobby.legs);
    }
}
