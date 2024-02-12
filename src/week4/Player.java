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
    public void takeDamage(int damage){
        this.HP-=damage;
    }
    public void attack(Player otherPlayer){
        otherPlayer.takeDamage(this.damageDealt);
    }
    public static void main(String[] args) {
        Player p1=new Player(6);
        Player p2=new Player(10);
        Player p3=p1;
        int hp=p1.getHP();
        p1.attack(p2);
    }
}
