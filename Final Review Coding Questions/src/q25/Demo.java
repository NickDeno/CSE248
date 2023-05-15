package q25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    //Given a list of Student objects, use Java stream to return a list that contains all the objects
    //whose GPAs are over 3.5.
    public static void main(String[] args){
        Student s1 = new Student("Nick", 19, 3.5 );
        Student s2 = new Student("Jeff", 25, 3.6);
        Student s3 = new Student("Jack", 21, 3.9 );
        Student s4 = new Student("Frank", 23, 3.2 );
        List<Student> studentList = new ArrayList<>(Arrays.asList(s1,s2,s3,s4));
        List<Student> filteredStudents = studentList.stream().filter(s -> s.getGpa() > 3.5).collect(Collectors.toList());
        filteredStudents.forEach(s -> System.out.println(s.toString()));

        
    }
}
