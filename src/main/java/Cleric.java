import java.util.ArrayList;

public class Cleric extends Player implements IAttack, IDamageable {


    private ArrayList<Attack> attacks;

    public Cleric(String name) {
        super(name);
        super.setStory("His good friend Friar Tuck has asked him to help out, he's got a keen sense for sinners and a mean left hook!");
        super.setHp(90);
        this.attacks = new ArrayList<Attack>();
        this.attacks.add(Attack.MELEE);
        this.attacks.add(Attack.SWORD_ATTACK_SMALL);
        this.attacks.add(Attack.LEFTHOOK);
    }



    public ArrayList<Attack> getAttacks() {
        return attacks;
    }

    public void attack(IDamageable victim, Attack attack) {
        victim.takeDamage(attack.getAttack_value());
    }

    public String takeDamage(int attackPoints) {
        this.setHp(this.getHp() - attackPoints);
        return "Hells Bells! That really hurt. You lost " + attackPoints + " points";
    }

    public void heal(Player player){
        player.setHp(player.getHp() + 50);
    }


}
