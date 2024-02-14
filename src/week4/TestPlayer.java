package week4;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestPlayer {
    @Test
    public void testPlayer(){
        Player p1=new Player(13);
        Player p2=new Player(13);
        assertEquals("Players same",p1.toString(),p2.toString());
        assertEquals("health: ",p1.getHP(),p2.getHP());
        assertEquals("max: ",p1.getMaxHP(),p2.getMaxHP());
        assertEquals("damage: ",p1.getDamageDealt(),p2.getDamageDealt());
        //assertEquals("health: ",p1.HP,p2.HP);
        //assertEquals("max: ",p1.maxHP,p2.maxHP);

    }
}
