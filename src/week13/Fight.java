package week13;

public class Fight <T> extends Edge<T>{
    private double price;
    private int distance;
    private double time;
    public Fight(T start,T end,double cost,
                 int distance,double time){
        super(start,end);
        price=cost;
        this.distance=distance;
        this.time=time;
    }

    public double getPrice() {
        return price;
    }

    public int getDistance() {
        return distance;
    }

    public double getTime() {
        return time;
    }
}
