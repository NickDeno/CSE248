package p1;

import java.util.ArrayList;
import java.util.List;

public class GStack <E> {
        private ArrayList<E> list;
        private int top;

        public GStack(int prefSize){
            list = new ArrayList<E>(prefSize);
            top = -1;
        }

        public void push(E element){
            list.add(++top, element);
        }

        public E pop(){
            return list.remove(top--);
        }

        public E peek(){
            return list.get(top);
        }

        public void display(){
            for(E element: list){
                System.out.print(element.toString() + " ");
            }
            System.out.println();
        }

        public void pushAll(List<E> list){
            for(E element: list){
                push(element);
            }
        }

        public ArrayList<E> popAll(){
            ArrayList<E> temp = new ArrayList<E>(this.list.size());
            for(E element: list){
                temp.add(element);
            }
            return temp;
        }
    
}
