import java.util.ArrayList;

public class Wizard extends Player implements IAttack, IDamageable {

    private ArrayList<Attack> attacks;

    public Wizard(String name){
        super(name);
        super.setStory("Just fresh out from conquering Mordor, he wishes to continue the good fight and goes on any adventure he can");
        super.setHp(200);
        this.attacks = new ArrayList<Attack>();
        this.attacks.add(Attack.MELEE);
        this.attacks.add(Attack.SWORD_ATTACK_SMALL);
        this.attacks.add(Attack.FIREBALL);
        this.attacks.add(Attack.THUNDERBOLT);

    }




    public ArrayList<Attack> getAttacks() {
        return attacks;
    }

    public void attack(IDamageable victim, Attack attack) {
        victim.takeDamage(attack.getAttack_value());
    }

    public String takeDamage(int attackPoints) {
        this.setHp(this.getHp() - attackPoints);
        return "Goodness! That really hurt. You lost " + attackPoints + " points";
    }

}
