package p3_enum_singleton;

public enum Settings {
    PERSON_BAG(20);
    private int maxSize;

    private Settings(int maxSize){
        this.maxSize = maxSize;
    }

    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }

    public int getMaxSize(){
        return maxSize;
    }
}
