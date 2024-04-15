package week12;

public class ProfessorHulk implements State{
    private BruceBanner banner;
    public ProfessorHulk(BruceBanner bruce){
        this.banner=bruce;
    }
    public void getAngry(){
        System.out.println("no problem");
    }
    public void calmDown(){
        System.out.println("already calm");
    }
    public void useCar(Car car){
        car.drive(true);
    }
    public void fight(){
        System.out.println("smash carefully");
    }
}
