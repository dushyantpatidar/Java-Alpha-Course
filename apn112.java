// encapsulation are 

class Pen{
    private String color;
    private int tip ;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setColor(String A){
       this.color = A ;
    }

    void setTip(int a){
        this.tip = a;
    }
}
public class apn112{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(4);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}