package q28;

public class StudentFactory {
    public static Student createStudent(int type){
        switch(type){
            case 0:
                return new FullTimeStudent();
            case 1:
                return new PartTimeStudent();
            default:
                return null;
        }   
    }
}
