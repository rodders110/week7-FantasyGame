import java.util.ArrayList;

public class Dragon extends Enemy implements IAttack, IDamageable {



    public Dragon() {
        super("Dragon");
        super.setHP(100);
        super.setAttacks(Attack.MELEE);
        super.setAttacks(Attack.FIREBALL);
        super.setAttacks(Attack.BITE);
    }


    public void attack(IDamageable victim, Attack attack) {
        victim.takeDamage(attack.getAttack_value());
    }

    public String takeDamage(int attackPoints) {
        this.setHP(this.getHP() - attackPoints);
        return "The dragon was damaged " + attackPoints + " points";
    }
}
