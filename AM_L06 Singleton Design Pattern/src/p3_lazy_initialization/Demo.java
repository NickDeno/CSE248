package p3_lazy_initialization;

public class Demo {
    public static void main(String[] args){
        Instructor instructor1 = Instructor.getInstance("Joe", 100);
        System.out.println("Name: " + instructor1.getName() + ", Salary: " + instructor1.getSalary());

        //Since instructor is already created in Instructor class, when getInstance() is called, a new Instructor with the name
        //Joey and salary of 100 will not be created, instead instructor1 will be returned
        Instructor instructor2 = Instructor.getInstance("Joey", 100);

        instructor1.setName("Joey");
        System.out.println(instructor1.getName());
        System.out.println(instructor2.getName());
    }
}
