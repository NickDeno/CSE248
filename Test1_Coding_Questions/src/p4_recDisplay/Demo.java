package p4_recDisplay;

public class Demo {
	public static void main (String[] args) {
		String[] arr = {"A", "B", "C", "D", "E"};
		recursiveDisplay(arr);
	}
	
	public static void recursiveDisplay(String[] arr) {
		recDisplay(arr, 0, arr.length);
	}
	
	public static void recDisplay(String[] arr, int currIdx, int lastIdx) {
		if(currIdx >= lastIdx) return;
		System.out.print(arr[currIdx] + " ");
		recDisplay(arr, currIdx+1, lastIdx);
	}
}
