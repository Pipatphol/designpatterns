package Main;

public class SingleTour implements Tour {

    private String name;
    private double price;
    private int allSeats;
    private int reservedSeats;

    public SingleTour(String name, double price, int allSeats){
        this.name = name;
        this.price = price;
        this.allSeats = allSeats;
        this.reservedSeats = 0;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getAvailableSeats() {
        return allSeats-reservedSeats;
    }
    public void setReservedSeats(int reservedSeats) {
        this.reservedSeats += reservedSeats;
    }
}
