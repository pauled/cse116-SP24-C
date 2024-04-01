package week10;

import java.util.ArrayList;

public class Player extends GameItem {
    private int maxHP;
    private int HP;
    private int damageDealt;
    private ArrayList<GameItem> inventory;

    public Player(int maxHP){
        super(0,0);
        this.maxHP=maxHP;
        this.HP=maxHP;
        this.damageDealt=4;
        this.inventory=new ArrayList<>();
    }
    public void pickUpItem(GameItem item){
        this.inventory.add(item);
    }
    public void useEntireInventory(){
        for (GameItem g : this.inventory){
            g.use(this);
        }
    }
    public int getHP(){
        return this.HP;
    }

    public int getDamageDealt() {
        return damageDealt;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void takeDamage(int damage){
        this.HP-=damage;
    }
    public void attack(Player otherPlayer){
        otherPlayer.takeDamage(this.damageDealt);
    }
    public String toString(){
        String out="health: "+this.HP+"/"+this.maxHP;
        out+=" damage dealt: "+this.damageDealt;
        out+=" location "+super.toString();
        return out;
    }
    public static void main(String[] args) {
        Player p1=new Player(6);
        Player p2=new Player(10);
        Player p3=p1;
        int hp=p1.getHP();
        p1.attack(p2);
        System.out.println(p1);
        System.out.println(p2.toString());
    }
}
