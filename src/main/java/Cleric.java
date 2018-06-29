import java.util.ArrayList;

public class Cleric extends Player implements IAttack, IDamageable {



    public Cleric(String name) {
        super(name);
        super.setStory("His good friend Friar Tuck has asked him to help out, he's got a keen sense for sinners and a mean left hook!");
        super.setHp(90);
        super.setAttacks(Attack.MELEE);
        super.setAttacks(Attack.SWORD_ATTACK_SMALL);
        super.setAttacks(Attack.LEFTHOOK);
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
