package q26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    //Given a list of Student objects, use Java stream to calculate their average GPA
    public static void main(String[] args){
        Student s1 = new Student("Nick", 19, 3.5 );
        Student s2 = new Student("Jeff", 25, 3.6);
        Student s3 = new Student("Jack", 21, 3.9 );
        Student s4 = new Student("Frank", 23, 3.2 );
        List<Student> studentList = new ArrayList<>(Arrays.asList(s1,s2,s3,s4));
        double averageGpa = studentList.stream().mapToDouble(s -> s.getGpa()).average().orElse(0.0);
        System.out.println(averageGpa);
    }
}
