package p3_enum_singleton;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args){
        // PersonBag personBag = PersonBag.INSTANCE;
        // personBag.insert(new Person("A", 3.5));
        // personBag.insert(new Person("B", 3.5));
        // personBag.display();
        // Utils.backup();
        PersonBag personBag = Utils.restore();
        personBag.display();
        System.out.println("Array Length: " + personBag.getArr().length);
        System.out.println("nElems: " + personBag.getNElems());
        System.out.println(Arrays.toString(personBag.getArr()));
    }
}
