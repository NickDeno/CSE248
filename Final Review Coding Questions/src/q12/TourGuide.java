package q12;

//"Whole" class in Composition relationship
public class TourGuide {
    private String name;
    private Passenger passenger;
    
    public TourGuide(String name){
        this.name = name;
        passenger = new Passenger(name);
    }

    //Performs TourGuide specific action
    public void leadTour(){
        System.out.println("Follow me!");
    }

    //Performs Passenger specific action
    public void boardPlane(){
        passenger.boardPlane();
    }
}
