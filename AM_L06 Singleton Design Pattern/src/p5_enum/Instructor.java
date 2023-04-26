package p5_enum;

public class Instructor {
    private String name;
    private Rank rank;

    public Instructor(String name, Rank rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Instructor [name=" + name + ", rank=" + rank + "]";
    }    
}
