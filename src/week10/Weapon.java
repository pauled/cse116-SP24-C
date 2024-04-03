package week10;


public class Weapon extends GameItem implements Usable{
    private int damage;

    public Weapon(double xLoc, double yLoc, int damage) {
        super(xLoc, yLoc);
        this.damage = damage;
    }

    public void use(Player player) {
        player.takeDamage(this.damage);
    }

    @Override
    public String toString() {
        String out="damage: "+this.damage+super.toString();
        return out;
    }
}