package week3;

public class PlusMinus {
    public static String letter(double score){
        if(score>=90){
            return "A";
        } else if(score>=80){
            return "B";
        } else if(score>=70){
            return "C";
        }else if(score>=60){
            return "D";
        } else {
            return "F";
        }
    }
    public static String pm(int score){
        int ones=score%10;
        if (score>=100){
            return "+";
        } else if (score<60){
            return "";
        } else if (ones>=7){
            return "+";
        } else if (ones>=3){
            return "";
        } else {
            return "-";
        }
    }
    public static void main(String[] args) {
        System.out.println("letter(95) expected A got: "+letter(95));
        System.out.println("letter(102) expected A got: "+letter(102));
        System.out.println("letter(90.0) expected A got: "+letter(90.0));
        System.out.println("letter(89.99) expected B got: "+letter(89.99));
        System.out.println("letter(73) expected C got: "+letter(73));
        System.out.println("letter(65) expected D got: "+letter(65));
        System.out.println("letter(59) expected F got: "+letter(59));
        System.out.println("letter(-95) expected F got: "+letter(-95));
        System.out.println("letter(5) expected F got: "+letter(5));

        double val=10;
        while (val>=0){
            System.out.println(val);
            val-=2;
            System.out.println(" "+val);
        }
        System.out.println("val after loop: "+val);

        val=10;
        for ( ;val>=0; ){
            System.out.println(val);
            val-=2;
            System.out.println(" "+val);
        }
        System.out.println("val after loop: "+val);
        int x=13;
        for ( x=0; x<5; x++){
            System.out.println(x);
            int y=4;
        }
        int y=3;
        System.out.println("x: "+x);
    }
}
