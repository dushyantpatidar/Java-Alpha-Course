abstract class ANimal{
    String color;
    ANimal(){
        System.out.println("Animal Class Constructor Called");
    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}
class Horse extends ANimal{
    Horse(){
        System.out.println("Horse Class Constructor Called");
    }
    void ChnageColor(){
        color = "Dark Brown";
    }
    void walk(){
        System.out.println("Walk on 4 legs ");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor Called ");
    }
}
class Chicken extends ANimal{
    void ChnageColor(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("Walk on 2 legs");
    }
}
public class apn120 {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        /*Chicken c = new Chicken();
        c.eat();
        c.walk();*/

        System.out.println(h.color);

        Mustang MyHourse = new Mustang();
        // Animal > Hourse > Mustang ;
        
    }
}
