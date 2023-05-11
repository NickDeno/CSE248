package p3_enum_singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Utils {
    public static PersonBag restore(){
        try {
            FileInputStream fis = new FileInputStream("personBag.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            PersonBag personBag = (PersonBag)(ois.readObject());
            personBag.display();
            ois.close();
            return personBag;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void backup(){
        PersonBag personBag = PersonBag.INSTANCE;
        personBag.display();
        try {
            FileOutputStream fos = new FileOutputStream("personBag.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(personBag);
            personBag.display();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
