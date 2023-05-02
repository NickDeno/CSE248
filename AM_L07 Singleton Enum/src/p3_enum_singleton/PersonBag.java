package p3_enum_singleton;

import java.io.Serializable;

public enum PersonBag implements Serializable {
    INSTANCE(new Person[Settings.PERSON_BAG.getMaxSize()]);
    
    private int maxSize;
    private Person[] arr;
    private int nElems;
    
    private PersonBag(Person[] arr){
        this.arr = arr;
        this.maxSize = arr.length;    
    }

    public int getNElems(){
        return nElems;
    }

    public Person[] getArr(){
        return arr;
    }

    public void insert(Person person){
        arr[nElems++] = person;
    }
    
    public void display(){
        System.out.println("Array Content: ");
        for(int i = 0; i < nElems; i++){
            System.out.println(arr[i]);
        }
    }
}
