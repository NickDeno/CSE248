package p3;

public class Demo {
    public static void main(String[] args){
        Integer[] arr = {5,3,6,1,2,4};
        System.out.println(maxElem(arr));
    }

    public static <T extends Comparable<T>> T maxElem(T[] arr){
        T max = arr[0];
        for(T element: arr){
            if(element.compareTo(max) > 0){
                max = element;
            }
        }
        return max;
    }
}
