package Assignment1;

public class Flight {
    private String flight;
    private String departure;
    private String arrival;

    public Flight(String flight, String departure, String arrival) {
       setValues(flight, departure, arrival);
       System.out.println(getValues());
    }

    public void setValues(String flight,String departure,String arrival){
        this.flight = flight;
        this.departure = departure;
        this.arrival = arrival;

    }
    public String getValues(){
        String output = "Flight: " + flight + ", Departure: " + departure + ", Arrival: " + arrival +"\n";
    return output;
    }
}

