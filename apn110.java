class Pen{
    String color;
    int tip ;
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name ;
    int age ;
    float precentage ; // cgpa

    void calcPrecentage(int phy , int chem,int math){
        precentage = (phy+chem+math)/3;
    }
}
public class apn110 {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // Created a pen 
        p1.setColor("Blue");
        
        System.out.println(p1.color);
        p1.color = "Yellow";
    }
}
