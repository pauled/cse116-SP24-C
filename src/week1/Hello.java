package week1;

public class Hello {
    public static int dumb(int x){
        int x2=x*2;
        return x2;
    }
    public static void main(String[] args) {
        System.out.println("Hello Nurse!");
        int x=13;
        x=x+3;
        x=7/6;
        double num=3.14;
        String str1="I ama string";
        boolean bool1=true;
        System.out.println("I am num: "+num);
        x=dumb(2);
    }
}