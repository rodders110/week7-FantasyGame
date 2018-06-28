import java.util.ArrayList;

public class Orc extends Enemy implements IAttack, IDamageable {

    private ArrayList<Attack> attacks;

    public Orc(String name) {
        super(name);
        super.setHP(50);
        attacks = new ArrayList<Attack>();
        attacks.add(Attack.MELEE);
        attacks.add(Attack.BITE);
    }

    public ArrayList<Attack> getAttacks() {
        return attacks;
    }

    public void attack(IDamageable victim, Attack attack) {
        victim.takeDamage(attack.getAttack_value());
    }

    public String takeDamage(int attackPoints) {
        this.setHP(this.getHP() - attackPoints);
        return "The orc was damaged " + attackPoints + " points";
    }

}
