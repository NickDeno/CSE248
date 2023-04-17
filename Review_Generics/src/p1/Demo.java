package p1;
//Test
import java.util.Arrays;

public class Demo {
    
    public static void main(String[] args){
        GStack<Integer> myStack = new GStack<>(10);
        myStack.pushAll(Arrays.asList(1,2,3,4,5));
        myStack.display();
    }
}
