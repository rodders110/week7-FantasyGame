import java.util.ArrayList;

public abstract class Enemy {

    private String name;
    private int HP;
    private ArrayList<Attack> attacks;

    public Enemy(String name) {
        this.name = name;
        this.HP = 0;
        this.attacks = new ArrayList<Attack>();
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getName() {

        return name;
    }

    public int getHP() {
        return HP;
    }

    public ArrayList<Attack> getAttacks() {
        return attacks;
    }

    public void setAttacks(Attack attack) {
        this.attacks.add(attack);
    }
}
