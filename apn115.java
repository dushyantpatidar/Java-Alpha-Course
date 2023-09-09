class Animal{
    String color;

    void eat(){
        System.out.println("Eat");
    }

    void breathe(){
        System.out.println("Breathes");
    }
}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water ");
    }
}
public class apn115 {
    public static void main(String[] args) {
        // Single level Inheritance 
        Fish shark = new Fish();
        shark.eat();
    }
}
