package q14;

public class Student {
    private String name;
    private Driver driver;

    public Student(String name) {
        this.name = name;
        this.driver = new Driver();
    }

    public void goToSchool() {
        System.out.println("Drive me to school!");
        driver.drive();
    }

}