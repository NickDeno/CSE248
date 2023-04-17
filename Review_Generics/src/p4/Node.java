package p4;

public class Node <E> {
    E data;
    Node<E> next;

    public Node(E data){
        this.data = data;
        this.next = null;
    }

    public E getData() {
        return this.data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getNext() {
        return this.next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

}
