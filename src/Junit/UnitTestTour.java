package Junit;

import Main.PackageTour;
import Main.ReserveManager;
import Main.SingleTour;
import Main.Tour;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTestTour {
    ReserveManager reserveManager;
    SingleTour waterFall;
    PackageTour package1;

    @BeforeEach
    void init(){
        reserveManager = new ReserveManager();
        waterFall = new SingleTour("น้ำตก", 500, 20);
        List<Tour> tours = new ArrayList<Tour>();
        tours.add(new SingleTour("น้ำตก", 500, 20));
        tours.add(new SingleTour("วัด", 600, 30));
        package1 = new PackageTour("น้ำตกและวัด",tours);
    }

    @Test
    void testReserveSingleTour(){
        reserveManager.reserveTour(waterFall,5);
        assertEquals(15, waterFall.getAvailableSeats());
    }

    @Test
    void testCalPricePackageTour(){
        assertEquals(990, package1.getPrice());
    }

    @Test
    void testReservePackageTour(){
        reserveManager.reserveTour(package1,3);
        assertEquals(17, package1.getAvailableSeats());
    }
}
