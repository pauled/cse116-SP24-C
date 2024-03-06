package week7;

public class RunGame {
    public static void main(String[] args) {
        HealthPotion hp1=new HealthPotion(1,2,3);
        Player p1=new Player(10);
        p1.move(13,42);
        hp1.use(p1);
        System.out.println(p1);
    }
}
