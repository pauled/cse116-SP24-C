package week3;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
public class TestCode {
    @Test
    public void testAddBothPositive() {
        assertTrue(CodeToTest.add(1, 2) == 3);
        assertTrue(CodeToTest.add(10, 2) == 12);
        assertTrue(CodeToTest.add(5, 5) == 10);
    }
    @Test
    public void testAddSecondNegative() {
        assertTrue(CodeToTest.add(8, -2) == 6);
        assertTrue(CodeToTest.add(8, -20) == -12);
    }
    @Test
    public void testAddFirstNegative() {
        assertTrue(CodeToTest.add(-8, 2) == -6);
        assertTrue(CodeToTest.add(-8, 20) == 12);
    }
    @Test
    public void testAddBothNegative() {
        assertTrue(CodeToTest.add(-3, -5) == -8);
        assertTrue(CodeToTest.add(-8, -8) == -16);
    }
    @Test
    public void testAddZero(){
        assertTrue(CodeToTest.add(-5,5) == 0);
        assertTrue(CodeToTest.add(5,-5) == 0);
        assertTrue(CodeToTest.add(0,3) == 3);
        assertTrue(CodeToTest.add(9,0) == 9);
        assertTrue(CodeToTest.add(0,0) == 0);
    }
}
