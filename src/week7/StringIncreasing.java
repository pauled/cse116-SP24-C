package week7;

public class StringIncreasing extends Comparator<String>{
    public boolean compare(String a,String b){
        return a.length()<b.length();
    }
}
