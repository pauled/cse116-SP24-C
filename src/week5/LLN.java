package week5;

public class LLN<D> {
    private D value;
    private LLN next;

    public LLN(D value,LLN next){
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

    public int size(){
        if (this.next==null){
            return 1;
        }
        int temp=this.next.size();
        return 1+temp;
    }
    public void append(D element){
        if (this.next==null){
            this.next=new LLN(element,null);
        } else {
            this.next.append(element);
        }
    }
    public LLN insert(D element,int loc){
        if (loc==0){
            return new LLN(element,this);
        }
        return insertHelper(this,element,loc);
    }
    public LLN insertHelper(LLN head,D element,int loc){
        if (loc==1){
            this.next=new LLN(element,this.next);
            return head;
        } else if (this.next!=null) {
            this.next.insertHelper(head,element,loc-1);
        }
        return head;
    }

    public static void main(String[] args) {
        LLN<Double> start=new LLN(1.1,null);
        start=new LLN(2.2,start);
        start=new LLN(3.3,start);
        String out=start.toString();
        System.out.println(out);
        int temp=start.size();
        System.out.println(temp);
    }
}

