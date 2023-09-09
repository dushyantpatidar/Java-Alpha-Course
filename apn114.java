class Student{

    String name;
    int roll;
    String Password ;
    int marks[];

    Student(Student s1){ // copy Constructor
        marks = new int [3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }
    
    Student(){
        marks = new int [3];
        System.out.println("Constructor is called......");
    }

    Student(String name){
        marks = new int [3];
        this.name = name;
    }
    Student(int roll){
        marks = new int [3];
        this.roll = roll;
    }
}
class apn114{
    public static void main(String args[]) {
        Student s1 = new Student(); 

        s1.name = "Dushyant";
        s1.roll = 34;
        s1.Password = " afveeds";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.Password = "abcd";

        s1.marks[2] = 100;
        for(int i = 0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}