package q13;

//Subclass. Inherits Passenger methods(activities)
public class TourGuide extends Passenger {

    public TourGuide(String name) {
        super(name);
    }

    public void leadTour(){
        System.out.println("Follow me!");
    }
    
}
