package p2_lazyInitialization;

public class Person {
    private String name;
    private double gpa;

    public Person(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", gpa=" + gpa + "]";
    } 
}
