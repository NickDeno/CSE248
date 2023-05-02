package p2_lazyInitialization;

public enum Settings {
    PERSON_BAG(100);
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
