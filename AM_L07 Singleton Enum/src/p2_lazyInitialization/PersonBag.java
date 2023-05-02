package p2_lazyInitialization;

import java.io.Serializable;

public class PersonBag implements Serializable {
    private Person[] arr;
    private int nElems;

    private static PersonBag personBag;
    
    private PersonBag(int maxSize){
        arr = new Person[maxSize];
    }

    public static PersonBag getInstance(int maxSize){
        if(personBag == null){
            personBag = new PersonBag(maxSize);
        }
        return personBag;
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
