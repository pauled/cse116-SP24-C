package week12.brain1;

public class Student {
    private MentalState state;

    public Student(){
        this.state=new Calm(this);
    }
    public void setState(MentalState state){
        this.state=state;
    }
    public  void getCloserToExam(){
        this.state.getCloserToExam();
    }
    public  void study(){
        this.state.study();
    }
    public void expressFeelings(){
        this.state.expressFeelings();
    }
    public void passClass(){
        this.state=new Chillin(this);
    }

    public static void main(String[] args) {
        Student jesse=new Student();
        jesse.study();
        jesse.getCloserToExam();
        jesse.getCloserToExam();
        jesse.expressFeelings();
        jesse.study();
        jesse.expressFeelings();
        jesse.passClass();
        jesse.expressFeelings();
    }
}
