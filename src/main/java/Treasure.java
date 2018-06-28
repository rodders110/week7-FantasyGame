public enum Treasure {
    GOLD("gold"),
    RUBIES("rubies"),
    DIAMONDS("diamonds");



    private String name;


    Treasure(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
