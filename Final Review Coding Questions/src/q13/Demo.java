package q13;

public class Demo {
    //Use inheritance to develop a class name TourGuide, who can also perform activities as a
    //Passenger in addition to other responsibilities such as leading tours.
    public static void main(String[] args){
        TourGuide t1 = new TourGuide("Nick");
        t1.boardPlane();
        t1.leadTour();
    }    
}
