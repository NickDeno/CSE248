package p5_enum;

public enum Day {
    SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);

    private int num;
    private Day(int value){
        num = value;
    }

    public void setValue(int value){
        num = value;
    }

    public int getValue(){
        return num;
    }
}
