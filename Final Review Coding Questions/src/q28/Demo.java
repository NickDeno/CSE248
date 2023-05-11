package q28;

public class Demo {
    //Use the Factory Design Pattern to design your program so the user could create either Full-Time
    //or Part-Time Student objects readily.
    public static void main(String[] args){
        Student s1 = StudentFactory.createStudent(0);
        Student s2 = StudentFactory.createStudent(1);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
