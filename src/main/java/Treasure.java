
import java.util.Random;

public enum Treasure {
    GOLD(1,"gold"),
    RUBIES(2, "rubies"),
    DIAMONDS(3, "diamonds");



    private String name;
    private int index;
    private Random a = new Random();



    Treasure(int index, String name){
        this.index = index;
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

}
