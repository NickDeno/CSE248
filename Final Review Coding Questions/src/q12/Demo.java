package q12;
public class Demo {
    //Use inheritance to develop a class name TourGuide, who can also perform activities as a
    //Passenger in addition to other responsibilities such as leading tours.
    public static void main(String[] args) throws Exception {
        TourGuide t1 = new TourGuide("Jim");
        t1.leadTour();
        t1.boardPlane();
    }
}
