package p4_bill_pugh;

public class Demo {
    public static void main(String[] args){
        Instructor instructor1 = Instructor.getInstance();
        Instructor instructor2 = Instructor.getInstance();
        System.out.println(instructor1 == instructor2);
    }
    
}
