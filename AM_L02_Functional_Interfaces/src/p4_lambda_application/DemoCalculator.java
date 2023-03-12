package p4_lambda_application;

public class DemoCalculator {

	public static void main(String[] args) {
		Computable add = (x,y) -> x + y;
		Computable sub = (x,y) -> x - y;
		Computable mult = (x,y) -> x * y;
		Computable div = DemoCalculator::doDivide; //Method reference
		
		System.out.println(add.compute(20, 30));
		System.out.println(sub.compute(20, 30));
		System.out.println(mult.compute(20, 30));
		System.out.println(div.compute(20, 30));
		System.out.println(div.compute(20,0));
		
	}
	
	public static double doDivide(double x, double y) {
		if(y == 0) {
			System.out.println("Undefined.");
			return Double.MAX_VALUE;
		} else {
			return x/y;
		}
	}

}
