package q23;

public class Demo {
    //Write an enum construct to limit the CS courses needed for the Computer Science degree to the
    //following: CSE118, CSE148, CSE218, CSE222, and CSE248. Also, set the default number of credits
    //to 3, 4, 3, 3, and 3, respectively. Provide corresponding setter and getter to allow the user to
    //change the number of credits for any of the courses.
    public static void main(String[] args){
        Courses c1  = Courses.CSE218;
        System.out.println(c1 + " credits: " + c1.getCredits());
        c1.setCredits(5);
        System.out.println(c1 + " credits: " + c1.getCredits());        
    }
}
