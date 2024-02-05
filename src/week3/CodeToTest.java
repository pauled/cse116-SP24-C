package week3;

public class CodeToTest {
    public static int add(int a,int b){
        return a+Math.abs(b);
    }

    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(8,-2));
        System.out.println(add(0,3));
    }
}
