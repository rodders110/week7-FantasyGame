import java.util.ArrayList;

public class Witch extends Player implements IAttack, IDamageable {



    public Witch(String name){
        super(name);
        super.setStory("Not cut out for Narnia, she decides to try her luck with the normal world. Has some good spells she likes to use, only for good of course!");
        super.setHp(190);
        super.setAttacks(Attack.MELEE);
        super.setAttacks(Attack.SWORD_ATTACK_SMALL);
        super.setAttacks(Attack.BATSTORM);
        super.setAttacks(Attack.HEX);
    }


    public String takeDamage(int attackPoints) {
        this.setHp(this.getHp() - attackPoints);
        return "It burns! That really burns. You lost " + attackPoints + " points";
    }

    public void attack(IDamageable victim, Attack attack) {
        victim.takeDamage(attack.getAttack_value());
    }

}
