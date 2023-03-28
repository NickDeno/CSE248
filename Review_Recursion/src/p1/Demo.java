package p1;

public class Demo {

	public static void main(String[] args) {
		System.out.println(calculateFib(10));
	}
	
	public static int calculateFib(int n) {
		if(n <= 1) return n;
		return calculateFib(n-1) + calculateFib(n-2);
	}
}
