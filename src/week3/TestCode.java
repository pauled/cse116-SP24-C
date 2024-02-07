package week3;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class TestCode {
    @Test
    public void testAddBothPositive() {
        assertEquals(CodeToTest.add(1, 2),3);
        assertEquals(CodeToTest.add(10, 2),12);
        assertEquals(CodeToTest.add(5, 5),10);
    }
    @Test
    public void testAddSecondNegative() {
        assertEquals(CodeToTest.add(8, -2),6);
        assertEquals(CodeToTest.add(8, -20),-12);
    }
    @Test
    public void testAddFirstNegative() {
        assertEquals(CodeToTest.add(-8, 2),-6);
        assertEquals(CodeToTest.add(-8, 20),12);
    }
    @Test
    public void testAddBothNegative() {
        assertEquals(CodeToTest.add(-3, -5),-8);
        assertEquals(CodeToTest.add(-8, -8),-16);
    }
    @Test
    public void testAddZero(){
        assertEquals(CodeToTest.add(-5,5),0);
        int actual=CodeToTest.add(5,-5);
        assertEquals("Inputs (5,-5) expected:0 got:"+actual,0,actual);
        assertEquals(CodeToTest.add(0,3),3);
        assertEquals(CodeToTest.add(9,0),9);
        assertEquals(CodeToTest.add(0,0),0);
    }
    @Test
    public void StringTest(){
        String a="Hello ";
        String b="Hi";
        String c=a+b;
        System.out.println(c);
        assertTrue(c.equals("Hello Hi"));
        assertEquals(c,"Hello Hi");
    }
    @Test
    public void DoubleTest(){
        double bad=0;
        for (int x=0; x<10; x++){
            bad+=.1;
        }
        System.out.println("bad: "+bad);
        assertEquals(bad,1.0,.001);
    }
    @Test
    public void TestPMCommon(){
        String actual=PlusMinus.pm(89);
        assertEquals("score: 89 expected:+ got:"+actual,"+",actual);
        actual=PlusMinus.pm(77);
        assertEquals("score: 77 expected:+ got:"+actual,"+",actual);
        actual=PlusMinus.pm(76);
        assertEquals("score: 76 expected: got:"+actual,"",actual);
        actual=PlusMinus.pm(63);
        assertEquals("score: 63 expected: got:"+actual,"",actual);
        actual=PlusMinus.pm(90);
        assertEquals("score: 90 expected: got:-"+actual,"-",actual);
        actual=PlusMinus.pm(82);
        assertEquals("score: 82 expected: got:-"+actual,"-",actual);
    }
    @Test
    public void TestPMUncommon(){
        String actual=PlusMinus.pm(100);
        assertEquals("score: 100 expected:+ got:"+actual,"+",actual);
        actual=PlusMinus.pm(105);
        assertEquals("score: 105 expected:+ got:"+actual,"+",actual);
        actual=PlusMinus.pm(9);
        assertEquals("score: 9 expected: got:"+actual,"",actual);
        actual=PlusMinus.pm(1);
        assertEquals("score: 1 expected: got:"+actual,"",actual);
    }
}
