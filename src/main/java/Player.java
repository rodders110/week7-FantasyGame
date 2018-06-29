import java.util.ArrayList;

public abstract class Player{

    private String name;
    private int hp;
    private String story;
    private ArrayList<Attack> attacks;

    public Player(String name) {
        this.name = name;
        this.hp = 0;
        this.story = " ";
        this.attacks = new ArrayList<Attack>();
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getStory() {
        return story;
    }

    public ArrayList<Attack> getAttacks() {
        return attacks;
    }

    public void setAttacks(Attack attack) {
        this.attacks.add(attack);
    }
}
