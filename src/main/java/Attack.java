public enum Attack {

    MELEE(2, "melee"),
    SWORD_ATTACK_SMALL(4, "small sword attack"),
    SWORD_ATTACK_LARGE(10, "big sword attack"),
    THUNDERBOLT(15, "thunderbolt"),
    FIREBALL(19, "fire ball"),
    BATSTORM(12, "storm of bats"),
    HEX(19, "hex"),
    LEFTHOOK(30, "left hook"),
    BITE(10, "Chomp");




    private int attack_value;
    private String name;

    Attack(int attack_value, String name){
        this.attack_value = attack_value;
        this.name = name;
    }

    public int getAttack_value() {
        return attack_value;
    }

    public String getName() {
        return name;
    }
}
