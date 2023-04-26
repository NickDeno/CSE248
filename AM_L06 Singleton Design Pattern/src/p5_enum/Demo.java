package p5_enum;


public class Demo {
    public static void main(String[] args){
        Instructor instructor1 = new Instructor("Joe", Rank.PROFESSOR);
        System.out.println(instructor1.toString());

        Day day1 = Day.SUNDAY;
        Day day2 = Day.FRIDAY;
        System.out.println(day1.getValue());
        System.out.println(day2.getValue());
    }
    
}
