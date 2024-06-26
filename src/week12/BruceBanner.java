package week12;

public class BruceBanner {
    private State state=new DrBanner(this);

    public void setState(State state){
        this.state=state;
    }
    public void getAngry(){
        this.state.getAngry();
    }
    public void calmDown(){
        this.state.calmDown();
    }
    public void useCar(Car car){
        this.state.useCar(car);
    }
    public void fight(){
        this.state.fight();
    }
    public void learnControl(){
        this.state=new ProfessorHulk(this);
    }

    public static void main(String[] args) {
        BruceBanner bruce=new BruceBanner();
        Car car=new Car();
        bruce.useCar(car);
        bruce.fight();
        bruce.getAngry();
        bruce.useCar(car);
        bruce.fight();
        bruce.calmDown();
        bruce.learnControl();
        bruce.useCar(car);
        bruce.fight();
    }
}
