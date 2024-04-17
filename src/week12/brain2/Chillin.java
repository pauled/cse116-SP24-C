package week12.brain2;

public class Chillin extends MentalState {
    public Chillin(){
    }
    public MentalState study(){
        System.out.println("I am such a good student I still study");
        return this;
    }
    public MentalState getCloserToExam(){
        System.out.println("I even take exams when I'm done");
        return this;
    }
    public MentalState expressFeelings(){
        System.out.println("I am done");
        return this;
    }
}
