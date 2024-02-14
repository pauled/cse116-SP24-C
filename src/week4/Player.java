package week4;

public class Player {
    private int maxHP;
    private int HP;
    private int damageDealt;

    public Player(int maxHP){
        this.maxHP=maxHP;
        this.HP=maxHP;
        this.damageDealt=4;
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
