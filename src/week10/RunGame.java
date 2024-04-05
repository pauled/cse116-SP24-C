package week10;

public class RunGame {
    public static void main(String[] args) {
        HealthPotion hp1=new HealthPotion(1,2,3);
        //System.out.println(hp1);
        Usable gi1=hp1;
        //System.out.println(gi1);
        //hp1.throwItem();
        //gi1.throwItem();
        Object o=hp1;
        Usable gi2=new HealthPotion(1,2,3);
        HealthPotion hp2=(HealthPotion) gi1;
        GameItem w1=new Weapon(4,5,6);
        System.out.println(w1);
        //HealthPotion hp3=(HealthPotion)w1;
        Player p1=new Player(10);
        p1.pickUpItem(hp1);
        p1.pickUpItem(gi2);
        Player p2=new Player(20);
        //p2.pickUpItem(p1);
        p2.move(1,2);
        p1.useEntireInventory();
        p1.move(13,42);
        hp1.use(p1);
        System.out.println(p1);
    }
}
