package p2_predicate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Predicate;

public class Bag <E> {
	private E[] arr;
	private int nElems;
	
	@SuppressWarnings("unchecked")
	public Bag(int maxSize) {
		arr = (E[]) Array.newInstance(arr.getClass(), maxSize);
		nElems = 0;
	}
	
	public void add (E o) {
		arr[nElems++] = o;
	}
	
	public void display() {
		for(E o: arr) {
			System.out.println(o);
		}
		System.out.println();
	}
	
	public E[] search(Predicate<E> predicate) {
		E[] results = (E[]) Array.newInstance(arr.getClass(), nElems);
		int count = 0;
		for(E o: arr) {
			if(predicate.test(o)) {
				results[count++] = o;
			}
		}
		return Arrays.copyOf(results, count);
	}

}
