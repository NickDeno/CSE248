package p2_recursiveBinarySearch;

public class Demo {
	
	public static void main(String[] args) {
		Integer[] arr = {1,3,6,5,4,2,7};
		System.out.println(recBinarySearch(arr, 20, 0, arr.length));
	}
	
	public static <T extends Comparable<T>> T recBinarySearch(T[] arr, T key, int leftPtr, int rightPtr) {
		if(leftPtr >= rightPtr) return null; //Base case
		
		int midPtr = (leftPtr+rightPtr)/2;
		
		if(arr[midPtr].equals(key)) {
			return arr[midPtr];
		} else if(arr[midPtr].compareTo(key) < 0) {
			return recBinarySearch(arr, key, midPtr +1, rightPtr);
		} else {
			return recBinarySearch(arr,key,leftPtr, rightPtr-1);
		}
		
		
	}
}
