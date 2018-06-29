import java.util.ArrayList;

public class Orc extends Enemy implements IAttack, IDamageable {



    public Orc() {
        super("Orc");
        super.setHP(50);
        super.setAttacks(Attack.MELEE);
        super.setAttacks(Attack.BITE);
    }



    public void attack(IDamageable victim, Attack attack) {
        victim.takeDamage(attack.getAttack_value());
    }

    public String takeDamage(int attackPoints) {
        this.setHP(this.getHP() - attackPoints);
        return "The orc was damaged " + attackPoints + " points";
    }

}
