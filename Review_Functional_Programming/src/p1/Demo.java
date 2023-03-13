package p1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo {
	
	public static void main(String[] args) {
		//Write a program that uses the Predicate functional interface to filter an array list 
		//of strings based on a certain condition such as the length of five or more */
		
		ArrayList<String> list = new ArrayList<>(Arrays.asList("Jacob", "Nick", "Chen", "CSE248"));
		list.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		//Approach 1
		Predicate<String> filter = s -> s.length()>= 5;
		ArrayList<String> filteredList = new ArrayList<>(list.size());
		for(String s: list) {
			if(filter.test(s)) {
				filteredList.add(s);
			}
		}	
		filteredList.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		//Approach 2(Using Streams)
		ArrayList<String> filteredList1 = (ArrayList<String>) list.stream().filter(s -> s.length() >= 5).collect(Collectors.toList());
		filteredList1.forEach(s -> System.out.print(s + " "));
		
	}
}
