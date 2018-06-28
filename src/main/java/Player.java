public abstract class Player{

    private String name;
    private int hp;
    private String story;

    public Player(String name) {
        this.name = name;
        this.hp = 0;
        this.story = " ";
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
}
