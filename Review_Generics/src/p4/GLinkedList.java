package p4;

import java.util.ArrayList;
import java.util.List;

public class GLinkedList <E> {
    private Node<E> head;
    private int nElems = 0;
    
    public void add(E data){
        Node<E> node = new Node<>(data);
        if(head == null){
            head = node;
        } else {
            Node<E> current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(node);
        }
        nElems++;
    }

    public void remove(E data){
        if(head == null) return;
        Node<E> previous = head;
        Node<E> current = head;
        while (current.getNext() != null) {
            if (current.getData().equals(data)) {
                previous.setNext(current.getNext());
            }
            previous = current;
            current = current.getNext();
        }
        //Checks last node of list
        if(current.getData().equals(data)){
            previous.setNext(null);
        }
    }

    public List<Node<E>> search(E data){
       List<Node<E>> temp = new ArrayList<>(nElems);
       Node<E> current = head;
       while(current.getNext() != null){
            if(current.getData().equals(data)){
                temp.add(current);
            }
            current = current.getNext();
       }
       return temp;
    }

    public void display(){
        if(head == null) return;
        Node<E> current = head;
        while(current.getNext() != null){
            System.out.print(current.getData().toString() + ", ");
            current = current.getNext();
        }    
        System.out.print(current.getData().toString());
        System.out.println();
    }
}
