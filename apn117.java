class ANimal1{
    String color;

    void eat(){
        System.out.println("Eat");
    }

    void breathe(){
        System.out.println("Breathes");
    }
}
class dog extends ANimal1{
    void Running(){
        System.out.println("Runnning....");
    }
}
class Cow extends ANimal1{
    void ProduceMilk(){
        System.out.println("Get Milk....");
    }
}
class apn117{
    public static void main(String[] args) {
        Cow c = new Cow();
        c.breathe();
        dog d =  new dog();
        d.eat();

    }
}