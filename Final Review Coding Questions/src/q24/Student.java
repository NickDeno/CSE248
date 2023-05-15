package q24;

import java.util.Optional;

public class Student {
    private Optional<String> name;
    private Optional<Double> gpa;

    public Student(String name, Double gpa){
        this.name = Optional.ofNullable(name);
        this.gpa = Optional.ofNullable(gpa);
    }

    public Optional<String> getName() {
        return name;
    }

    public Optional<Double> getGpa() {
        return gpa;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public void setGpa(Optional<Double> gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", gpa=" + gpa + "]";
    }
}
