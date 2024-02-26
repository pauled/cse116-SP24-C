package week6;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
public class TestSinpleMath {
    @Test
    public void testFactorialCommon(){
        HashMap<Integer,Integer> testCases=new HashMap<>();

        testCases.put(1,1);
        testCases.put(2,2);
        testCases.put(3,6);
        testCases.put(4,24);
        testCases.put(5,120);
        testCases.put(6,720);
        testCases.put(7,5040);
        testCases.put(8,40320);
        testCases.put(9,362880);

        for (int input : testCases.keySet()){
            int expected=testCases.get(input);
            int actual=SinpleMath.factorial(input);
            assertEquals("factorial("+input+")",expected,actual);
        }
    }
    @Test
    public void testFactorialUncommon(){
        HashMap<Integer,Integer> testCases=new HashMap<>();

        testCases.put(10,3628800);

        for (int input : testCases.keySet()){
            int expected=testCases.get(input);
            int actual=SinpleMath.factorial(input);
            assertEquals("factorial("+input+")",expected,actual);
        }
    }
    @Test
    public void testFactorialEdgeCases(){
        HashMap<Integer,Integer> testCases=new HashMap<>();

        testCases.put(0,1);
        testCases.put(-200,-1);
        testCases.put(Integer.MIN_VALUE,-1);

        for (int input : testCases.keySet()){
            int expected=testCases.get(input);
            int actual=SinpleMath.factorial(input);
            assertEquals("factorial("+input+")",expected,actual);
        }
    }
    @Test
    public void testMultiply(){
        ArrayList<MultiplyTestCase> testCases =new ArrayList<>(Arrays.asList(
                new MultiplyTestCase(1,1,1),
                new MultiplyTestCase(10,5,50),
                new MultiplyTestCase(100,100,10000),
                new MultiplyTestCase(-3,-4,12),
                new MultiplyTestCase(-5,10,-50),
                new MultiplyTestCase(12,-4,-48),
                new MultiplyTestCase(0,0,0),
                new MultiplyTestCase(0,15,0),
                new MultiplyTestCase(13,0,0),
                new MultiplyTestCase(-5005,0,0),
                new MultiplyTestCase(0,-12000,0)
        ));


        for (MultiplyTestCase testCase : testCases){
            int in1=testCase.getInputOne();
            int in2=testCase.getInputTwo();
            int expected=testCase.getExpectedOutput();

            int actual=SinpleMath.multiplyInt(in1,in2);

            assertEquals("multiply("+in1+","+in2+")",expected,actual);
        }
    }
}
