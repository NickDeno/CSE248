package p2_eager_initialization;

    /* Problems:
     * 1. Program takes longer to load, b/c object has to be created before program starts
     * 2. Not thread safe. Multiple threads accessing the same object can be a problem
     * 3. Even if object is not needed, it is still created and loaded.
     */

public class Instructor {
    private String name;
    private double salary;

    //Belongs to Instructor class, not object => "Class level". This means there can only be 1 copy
    //of Instructor.
    private static Instructor instructor = new Instructor("Joe", 1000); 

    private Instructor(String name, double salary) {
        super();
        this.name = name;
        this.salary = salary;
    }

    public static Instructor getInstance(){
        return instructor;
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

    @Override
    public String toString() {
        return "Instructor [name=" + name + ", salary=" + salary + "]";
    }
    
}
