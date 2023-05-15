package q24;

public class Demo {
    //Use the Optional class to prevent a Student object from causing NullPointerException.
    public static void main(String[] args){
        Student s1 = new Student("Nick", 3.5 );
        Student s2 = new Student("Jim", null);
        System.out.println(s1.getGpa().map(Object::toString).orElse("GPA not available"));
        System.out.println(s2.getGpa().map(Object::toString).orElse("GPA not available"));
    }
}
