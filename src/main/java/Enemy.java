public abstract class Enemy {

    private String name;
    private int HP;

    public Enemy(String name) {
        this.name = name;
        this.HP = 0;
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
}
