package week5;

public class LinkedListNodeInt {
    private int value;
    private LinkedListNodeInt next;

    public LinkedListNodeInt(int value,LinkedListNodeInt next){
        this.value=value;
        this.next=next;
    }

    @Override
    public String toString() {
        String out="";
        if (this.next==null){
            //base case
            out+=this.value;
        } else {
            //recursive case
            out=""+this.value+" ";
            out+=this.next;
        }
        return out;
    }
    public String toString2() {
        if (this.next==null){
            //base case
            return ""+this.value;
        } else {
            //recursive case
            return ""+this.value+" "+this.next.toString2();
        }
    }

    public static void main(String[] args) {
        LinkedListNodeInt start=new LinkedListNodeInt(1,null);
        start=new LinkedListNodeInt(2,start);
        start=new LinkedListNodeInt(3,start);
        String out=start.toString();
        System.out.println(out);
    }
}
