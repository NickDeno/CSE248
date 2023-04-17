package p2;

public class Pair <T> {
    private T elem1;
    private T elem2;
    public Pair(T elem1, T elem2){
        this.elem1 = elem1;
        this.elem2 = elem2;
    }

    public T getElem1() {
        return this.elem1;
    }

    public void setElem1(T elem1) {
        this.elem1 = elem1;
    }

    public T getElem2() {
        return this.elem2;
    }

    public void setElem2(T elem2) {
        this.elem2 = elem2;
    }

    public void display(){
        System.out.println(elem1.toString() + ", " + elem2.toString());
    }
    @Override
    public String toString() {
        return "{" +
            " elem1='" + getElem1() + "'" +
            ", elem2='" + getElem2() + "'" +
            "}";
    }

}
