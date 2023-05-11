package q23;

public enum Courses {
    CSE118(3), CSE148(4), CSE218(3), CSE222(3), CSE28(4);  
    private int credits;

    private Courses(int credits){
        this.credits = credits;
    }

    public int getCredits(){
        return credits;
    }

    public void setCredits(int credits){
        this.credits = credits;
    }

}
