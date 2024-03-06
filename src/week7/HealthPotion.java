package week7;


public class HealthPotion extends GameItem{
    private int heal;

    public HealthPotion(double xLoc,double yLoc,int heal){
        super(xLoc,yLoc);
        this.heal=heal;
    }
    public void use(Player player){
        player.takeDamage(-this.heal);
    }
    public String toString() {
        String out="heal: "+this.heal+super.toString();
        return out;
    }

    public static void main(String[] args) {
        HealthPotion hp1=new HealthPotion(1,2,3);
        System.out.println(hp1);
        Weapon w1=new Weapon(4,5,6);
        System.out.println(w1);
        Player p1=new Player(10);
        System.out.println(p1);
        p1.move(13,42);
        hp1.move(10,10);
        System.out.println(p1);
        System.out.println(hp1);
    }
}
