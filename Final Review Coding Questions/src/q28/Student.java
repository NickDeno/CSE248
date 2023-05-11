package q28;

public abstract class Student {
    private String name;
    private Double gpa;
    private String status;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }   

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", gpa=" + gpa + ", status=" + status + "]";
    }

}
