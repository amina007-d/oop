import Assignment1.Flight;
import Assignment1.Passenger;
import Assignment1.Reservation;
public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("Maqsat",27, "87779638451"  );
        Flight flight = new Flight("KC 877", "20.11.24", "21.11.24");
        Reservation reservation = new Reservation(25000, "6F", 23);
    }
}