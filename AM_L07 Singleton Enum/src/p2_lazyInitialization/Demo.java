package p2_lazyInitialization;

public class Demo {
    public static void main(String[] args){
        PersonBag personBag = PersonBag.getInstance(100);
        personBag.insert(new Person("A", 3.5));
        personBag.insert(new Person("B", 3.5));
        personBag.display();
        Utils.backup();
    }
}
