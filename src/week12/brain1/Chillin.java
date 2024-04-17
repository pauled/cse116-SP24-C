package week12.brain1;

public class Chillin extends MentalState{
    public Chillin(Student brain){
        super(brain);
    }
    public void study(){
        System.out.println("I am such a good student I still study");
    }
    public void getCloserToExam(){
        System.out.println("I even take exams when I'm done");
    }
    public void expressFeelings(){
        System.out.println("I am done");
    }
}
