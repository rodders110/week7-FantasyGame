import java.util.ArrayList;

public class Witch extends Player implements IAttack, IDamageable {

    private ArrayList<Attack> attacks;

    public Witch(String name){
        super(name);
        super.setStory("Not cut out for Narnia, she decides to try her luck with the normal world. Has some good spells she likes to use, only for good of course!");
        super.setHp(190);
        this.attacks = new ArrayList<Attack>();
        this.attacks.add(Attack.MELEE);
        this.attacks.add(Attack.SWORD_ATTACK_SMALL);
        this.attacks.add(Attack.BATSTORM);
        this.attacks.add(Attack.HEX);
    }



    public ArrayList<Attack> getAttacks() {
        return attacks;
    }

    public String takeDamage(int attackPoints) {
        this.setHp(this.getHp() - attackPoints);
        return "It burns! That really burns. You lost " + attackPoints + " points";
    }

    public void attack(IDamageable victim, Attack attack) {
        victim.takeDamage(attack.getAttack_value());
    }

}
