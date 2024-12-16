package Assignment1;

public class Reservation {
    private int price;
    private String seat;
    private int baggage;

    public Reservation(int price, String seat, int baggage) {
        setValues(price, seat, baggage);
        System.out.println(getValues());
        System.out.println(checkBaggage());
    }

    public void setValues(int price, String seat, int baggage){
        this.price = price;
        this.seat = seat;
        this.baggage = baggage;

    }
    public String getValues(){
        String values = "Price: " + price + ",  Seat: " + seat + ", Baggage: " + baggage +"\n";
        return values;
    }
    public String checkBaggage(){
        if(this.baggage > 23){
            return "Overweight";
        }
        return "Baggage is okay";
    }
}
