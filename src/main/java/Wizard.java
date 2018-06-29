import java.util.ArrayList;

public class Wizard extends Player implements IAttack, IDamageable {



    public Wizard(String name){
        super(name);
        super.setStory("Just fresh out from conquering Mordor, he wishes to continue the good fight and goes on any adventure he can");
        super.setHp(200);
        super.setAttacks(Attack.MELEE);
        super.setAttacks(Attack.SWORD_ATTACK_SMALL);
        super.setAttacks(Attack.FIREBALL);
        super.setAttacks(Attack.THUNDERBOLT);

    }




    public void attack(IDamageable victim, Attack attack) {
        victim.takeDamage(attack.getAttack_value());
    }

    public String takeDamage(int attackPoints) {
        this.setHp(this.getHp() - attackPoints);
        return "Goodness! That really hurt. You lost " + attackPoints + " points";
    }

}
