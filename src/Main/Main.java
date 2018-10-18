package Main;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
            ReserveManager reserveManager = new ReserveManager();
            SingleTour waterFall = new SingleTour("น้ำตก", 100, 10);
            SingleTour wat = new SingleTour("วัด", 400, 15);

            System.out.println("ทัวร์"+waterFall.getName()+" ราคา "+waterFall.getPrice()+" มี " +waterFall.getAvailableSeats()+" ที่นั่ง");
            reserveManager.reserveTour(waterFall,3);
            System.out.println("ทัวร์"+waterFall.getName()+" ราคา "+waterFall.getPrice()+" เหลือ " +waterFall.getAvailableSeats()+" ที่นั่ง");
            System.out.println("------------------------------------------");
            System.out.println("ทัวร์"+wat.getName()+" ราคา "+wat.getPrice()+" มี " +wat.getAvailableSeats()+" ที่นั่ง");
            reserveManager.reserveTour(wat,3);
            System.out.println("ทัวร์"+wat.getName()+" ราคา "+wat.getPrice()+" เหลือ " +wat.getAvailableSeats()+" ที่นั่ง");
            System.out.println("------------------------------------------");

            List<Tour> tours = new ArrayList<Tour>();
            tours.add(new SingleTour("น้ำตก", 500, 10));
            tours.add(new SingleTour("วัด", 1500, 15));

            PackageTour package1 = new PackageTour("น้ำตกและวัด",tours);

            System.out.println("ทัวร์"+package1.getName()+" ราคา "+package1.getPrice()+" มี " +package1.getAvailableSeats()+" ที่นั่ง");
            reserveManager.reserveTour(package1,5);
            System.out.println("ทัวร์"+package1.getName()+" ราคา "+package1.getPrice()+" เหลือ " +package1.getAvailableSeats()+" ที่นั่ง");
            reserveManager.reserveTour(package1,5);
            System.out.println("ทัวร์"+package1.getName()+" ราคา "+package1.getPrice()+" เหลือ " +package1.getAvailableSeats()+" ที่นั่ง");

    }

}
