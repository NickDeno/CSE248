package q28;

public class FullTimeStudent extends Student {

    public FullTimeStudent(){
        setGpa(Math.round(Math.random()*4.0));
        setName("Bob");
        setStatus("Full Time Student");
    }
    
}
