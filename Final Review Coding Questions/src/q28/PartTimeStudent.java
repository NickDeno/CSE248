package q28;

public class PartTimeStudent extends Student {
    
    public PartTimeStudent(){
        setGpa(Math.round(Math.random()*4.0));
        setName("Jim");
        setStatus("Part Time Student");
    }

}
