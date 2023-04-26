package p4_bill_pugh;

/*
 * 1. By providing private constructor, Java will not create public default constructor
 * 2. This method is thread safe. Most common method used.
 */
public class Instructor {
    private String name;
    private double salary;

    private Instructor(){}

    //Inner class. Also a static class. This means we cannot create objects of SingletonHelper class. 
    private static class SingletonHelper{
        private static Instructor instructor = new Instructor();
        
    }

    public static Instructor getInstance(){
        return SingletonHelper.instructor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    
}
