package q27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    //Given a list of Student objects, use Java stream to calculate their average GPA
    public static void main(String[] args){
        Student s1 = new Student("Nick", "Deno", 19, 3.5 );
        Student s2 = new Student("Jeff", "Smith", 25, 3.6);
        Student s3 = new Student("Jack", "Doe", 21, 3.9 );
        Student s4 = new Student("Frank", "Adams", 23, 3.2 );
        List<Student> studentList = new ArrayList<>(Arrays.asList(s1,s2,s3,s4));
        List<Student> newList = studentList.stream().filter(s -> {
            String lastName = s.getLastName();
            return lastName.startsWith("A") ||
                    lastName.startsWith("B") ||
                    lastName.startsWith("C") ||
                    lastName.startsWith("D");
        }).collect(Collectors.toList());
        newList.forEach(s -> System.out.println(s.toString()));
    }
}
