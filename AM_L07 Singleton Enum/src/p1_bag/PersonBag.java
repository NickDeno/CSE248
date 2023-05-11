package p1_bag;

import java.io.Serializable;

public class PersonBag implements Serializable {
    private Person[] arr;
    private int nElems;

    public PersonBag(int maxSize){
        arr = new Person[maxSize];
    }

    public void insert(Person person){
        arr[nElems++] = person;
    }

    public void display(){
        for(Person p: arr){
            System.out.println(p);
        }
        System.out.println();
    }
}
