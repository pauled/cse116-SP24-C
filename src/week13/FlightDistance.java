package week13;

public class FlightDistance implements Cost<Fight>{
    public double cost(Fight flight){
        return flight.getDistance();
    }
}
