package p4;

public class Demo {
    public static void main(String[] args){
        GLinkedList<Integer> myList = new GLinkedList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(2);
        myList.display();
        myList.remove(2);
        myList.display();
    }
}
