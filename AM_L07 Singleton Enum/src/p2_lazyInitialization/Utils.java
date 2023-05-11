package p2_lazyInitialization;

public class Utils {
    public static void backup(){
        PersonBag personBag = PersonBag.getInstance(Settings.PERSON_BAG.getMaxSize());
        
    }
}
