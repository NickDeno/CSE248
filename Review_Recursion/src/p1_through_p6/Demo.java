package p1_through_p6;

import java.util.Arrays;
import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		//1.
		System.out.println(calculateFib(10));
		
		//2.
		System.out.println(calculateFact(10));
		
		//3.
		int[] arr = {1,2,3,4,5,6};
		System.out.println(sumArray(arr));	
		
		//4.
		System.out.println(reverseString("Hello"));
		
		//5.
		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
		printReverse(list);
		System.out.println();
		
		//6.
		String str1 = "ABCDCBA";
		String str2 = "ABCCBA";
		String str3 = "ABEDCE";
		System.out.println(isPalindrome(str1));
		System.out.println(isPalindrome(str2));
		System.out.println(isPalindrome(str3));
		
	}
	
	// 1. Write a recursive function to calculate the nth Fibonacci number
	public static int calculateFib(int n) {
		if(n <= 1) return n;
		return calculateFib(n-1) + calculateFib(n-2);
	}
	
	// 2. Write a recursive function to calculate the factorial of a given number.
	public static int calculateFact(int n) {
		if(n == 0 || n == 1) return 1;
		return n * calculateFact(n-1);
	}
	
	// 3. Write a recursive function to compute the sum of an array of integers.
	public static int sumArray(int[] arr) {
		return recSum(arr, 0);
	}
	private static int recSum(int[] arr, int count) {
		if(count == arr.length) return 0;
		return arr[count] + recSum(arr, count+1);
	}
	
	// 4. Write a recursive function to reverse a string
	public static String reverseString(String str) {
		return recReverse(str, str.length());
	}
	private static String recReverse(String str, int idx) {
		if(idx == 0) return "";
		return str.substring(idx-1, idx) + recReverse(str, idx-1);
	}
	
	// 5. Write a recursive function to print the elements of a linked list in reverse order.
	public static <T> void printReverse(LinkedList<T> list) {
		if(list.isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		recPrintReverse(list, list.size()- 1);
	}
	private static <T> void recPrintReverse(LinkedList<T> list, int idx) {
		if(idx == -1) return;
		System.out.print(list.get(idx).toString() + " ");
		recPrintReverse(list, idx-1);
		
	}
	
	// 6. Write a recursive function to check if a given string is a palindrome
	public static boolean isPalindrome(String str) {
		if(str.isEmpty() || str.length() == 1) return true;
		return recIsPalindrome(str, 0);
	}
	private static boolean recIsPalindrome(String str, int count) {
		if(count == str.length()/2) return true;
		if(str.charAt(0 + count) != str.charAt(str.length()-1-count)) {
			return false;
		}
		return recIsPalindrome(str, count + 1);
	}

	
}
