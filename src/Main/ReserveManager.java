package Main;

public class ReserveManager {
    public void reserveTour(Tour tour, int seats){
        if (tour.getAvailableSeats()>0){
            tour.setReservedSeats(seats);
        }
    }
}
