package p1_intro;

public class PersonBag {
    //We usually only create one "PersonBag" when using PersonBag class. With this design, user is able to create
    //multiple PersonBag objects which could be problematic. Solution is Singleton
    private Person[] arr; 
    private int nElems;

}
