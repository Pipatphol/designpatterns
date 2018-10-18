package Main;

import java.util.ArrayList;
import java.util.List;

public class PackageTour implements Tour {
    private String packageName;
    private List<Tour> tours = new ArrayList<Tour>();
    private int minSeatIndex;

    public PackageTour(String packageName, List<Tour> tours){
        this.packageName = packageName;
        this.tours = tours;
    }
    public String getName() {
        return packageName;
    }
    public double getPrice() {
        double total = 0;
        for (Tour t : tours)
            total += t.getPrice();
        return total*0.9;
    }
    public int getAvailableSeats() {
        int minSeats = 100;
        int index = 0;
        for (Tour t : tours)
            if (t.getAvailableSeats()<minSeats && minSeats >= 0){
                minSeats = t.getAvailableSeats();
                minSeatIndex = index;
            }
        index++;
        return minSeats;
    }
    public void setReservedSeats(int reservedSeats) {
        tours.get(minSeatIndex).setReservedSeats(reservedSeats);
    }
}
