package week6;

public class SinpleMath {
    public static int factorial(int n){
        if (n<0){
            return -1;
        } else if(n==0){
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
    public static int multiplyInt(int x,int y){
        if (x==0 || y==0){
            return 0;
        }
        boolean xBoolean= x<0;
        boolean yBoolean= y<0;
        int result=mutiplyHelper(Math.abs(x),Math.abs(y));
        if (xBoolean == yBoolean){
            return result;
        } else {
            return -1 * result;
        }
        /*@@#$%^%&* you Jesse
        if (xBoolean ^ yBoolean){
            return -1 * result;
        } else {
            return result;
        }*/
    }
    private static int mutiplyHelper(int x, int y){
        if (y==1){
            return x;
        } else {
            return x + mutiplyHelper(x,y-1);
        }
    }
}
