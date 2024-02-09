package week3;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class TestRecursion {
    @Test
    public void TestAdd(){
        int actual=FirstRecursion.add(10,0);
        assertEquals("(10,0) expected: 10 actual:"+actual,10,actual);
        actual=FirstRecursion.add(4,5);
        assertEquals("(4,5) expected: 9 actual:"+actual,9,actual);
        actual=FirstRecursion.add(0,5);
        assertEquals("(0,5) expected: 5 actual:"+actual,5,actual);
        actual=FirstRecursion.add(10,-1);
        assertEquals("(10,-1) expected: 9 actual:"+actual,9,actual);
    }
}
