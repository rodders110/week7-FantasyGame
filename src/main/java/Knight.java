import java.util.ArrayList;

public class Knight extends Player implements IAttack, IDamageable{




    public Knight(String name){
        super(name);
        super.setStory("After losing his family to a terrible housefire caused by Christophilax Dilves - the Dragon, he travels from town to town seeking out this Dragon to exact his revenenge. To make ends meet his is a sword for hire and will help with any quest if the price is right");
        super.setHp(120);
        super.setAttacks(Attack.MELEE);
        super.setAttacks(Attack.SWORD_ATTACK_LARGE);
        super.setAttacks(Attack.SWORD_ATTACK_SMALL);
    }


    public String takeDamage(int attackPoints) {
        this.setHp(this.getHp() - attackPoints);
        return "Ouch! That hurt. You lost " + attackPoints + " points";
    }

    public void attack(IDamageable victim, Attack attack) {
        victim.takeDamage(attack.getAttack_value());
    }


}