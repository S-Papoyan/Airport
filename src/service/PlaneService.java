package service;
import model.Plane;

import java.util.Scanner;

public class PlaneService {

    public Plane create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter model: ");
        String model = scanner.next();
        System.out.println("Enter country: ");
        String country = scanner.next();
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        System.out.println("Enter hours: ");
        long hours = scanner.nextLong();
        System.out.println("Enter is military: true/false? ");
        boolean isMilitary = scanner.nextBoolean();
        System.out.println("Enter weight: ");
        int weight = scanner.nextInt();
        System.out.println("Enter wingspan: ");
        byte wingspan = scanner.nextByte();
        System.out.println("Enter top speed");
        int topSpeed = scanner.nextInt();
        System.out.println("Enter number of seats: ");
        int seats = scanner.nextInt();
        System.out.println("Enter cost of the plane: ");
        double cost = scanner.nextDouble();
        return new Plane(model, country, year, hours, isMilitary, weight, wingspan, topSpeed, seats, cost);
    }


    public void task1(Plane p1) {
        p1.print();
    }


    public void task2(Plane p1) {
        if (p1.isMilitary()) {
            System.out.println("Cost: " + p1.getCost());
            System.out.println("Top speed: " + p1.getTopSpeed());
        } else {
            System.out.println("Model: " + p1.getModel());
            System.out.println("Country: " + p1.getCountry());
        }
    }

    public Plane task3(Plane p1, Plane p2) {
        if (p1.getYear() >= p2.getYear()) {
            return p1;
        } else {
            return p2;
        }
    }

    public String task4(Plane p1, Plane p2) {
        if (p1.getWingspan() > p2.getWingspan()) {
            return p1.getModel();
        } else return p2.getModel();
    }

    public String task5(Plane p1, Plane p2, Plane p3) {
        if (p1.getSeats() <= p2.getSeats() && p1.getSeats() <= p3.getSeats()) {
            return p1.getCountry();
        } else if (p2.getSeats() <= p1.getSeats() && p2.getSeats() <= p3.getSeats()) {
            return p2.getCountry();
        } else {
            return p3.getCountry();
        }
    }

    public void task6(Plane[] planes) {
        for (Plane plane : planes) {
            if (!plane.isMilitary()) {
                plane.print();
            }
        }
    }

    public void task7(Plane[] planes) {
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary() && planes[i].getHours() > 100) {
                System.out.println(planes[i].getCountry());
            }
        }
    }

    public Plane task8(Plane[] planes) {
        Plane minWeight = null;
        for (Plane plane : planes) {
            if (minWeight == null) {
                minWeight = plane;
            } else if (plane.getWeight() <= minWeight.getWeight()) {
                minWeight = plane;
            }
        }
        return minWeight;
    }

    public Plane task9(Plane[] planes) {
        Plane minCost = null;
        for (Plane plane : planes) {
            if (minCost == null) {
                if (plane.isMilitary()) {
                    minCost = plane;
                }
            } else if (plane.isMilitary() && plane.getCost() < minCost.getCost()) {
                minCost = plane;
            }
        }
        if(minCost == null){
            System.out.println("Not Plane");
        }
        return minCost;
    }

    public void task10(Plane[] planes) {
        for (int i = 0; i < planes.length; i++) {
            for (int j = i + 1; j < planes.length; j++) {
                if (planes[i].getYear() > planes[j].getYear()) {
                    Plane temp = planes[j];
                    planes[j] = planes[i];
                    planes[i] = temp;
                }
            }
            planes[i].print();
        }
    }

    public void task100(Plane[]planes){
        Plane temp = null;
        for (int i = 0; i < planes.length; i++) {
            for (int j = 0; j < planes.length - 1; j++) {
                if(planes[j-1].getYear()<planes[j].getYear()){
                    temp = planes[j-1];
                    planes[j-1] = planes[j];
                    planes[j] = temp;
                }
            }
            for (Plane x: planes) {
                System.out.println(x);
            }
        }
    }
}




