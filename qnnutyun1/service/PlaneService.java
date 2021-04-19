package qnnutyun1.service;


import qnnutyun1.model.Plane;

import java.util.Scanner;

public class PlaneService {



    public Plane create() {
        Scanner s = new Scanner(System.in);

        String model = "";
        do {
            System.out.println("enter model");
            model = s.next();
        } while (model.isEmpty());


        String country = "";
        do {
            System.out.println("enter country");
            country = s.next();
        } while (country.isEmpty());


        int year = 0;
        do {
            System.out.println("enter year of publishing  (from 1903 to 2020)");
            year = s.nextInt();
        } while (year < 1903 || year > 2020);


        int hours = 0;
        do {
            System.out.println("hours in air (from 0 to 10000)");
            hours = s.nextInt();
        } while (hours < 0 || hours > 10000);


        System.out.println("is military y/n");
        boolean isMilitary = s.next().charAt(0) == 'y';

        System.out.println("enter weight");
        double weight = s.nextDouble();

        System.out.println("enter Speed");
        int topSpeed = s.nextInt();

        System.out.println("enter seats");
        int seats = s.nextInt();

        System.out.println("enter cost");
        double cost = s.nextDouble();


        Plane p1 = new Plane(model, country, year);
        p1.setHours(hours);
        p1.setMilitary(isMilitary);
        p1.setWeight(weight);
        p1.setTopSpeed(topSpeed);
        p1.setSeats(seats);
        p1.setCost(cost);
        return p1;

    }


    public void isMilitary(Plane plane) {
        if (plane.isMilitary()) {
            System.out.printf("cost-%f,topSpeed-%d", plane.getCost(), plane.getTopSpeed());
        } else {
            System.out.printf("model-%s,country-%s", plane.getModel(), plane.getCountry());
        }
    }

    public Plane newPlane(Plane p1, Plane p2) {
        return (p1.getYear() >= p2.getYear() ? p1 : p2);
    }

    public void smallestSeats(Plane p1, Plane p2, Plane p3) {
        Plane smallest = p1.getSeats() <= p2.getSeats() ? p1 : p2;
        if (smallest.getSeats() > p3.getSeats())
            smallest = p3;
        System.out.println(smallest.getCountry());
    }

    public void allNotMilitaryPlanes(Plane[] planArr) {
        for (Plane plane : planArr) {
            if (!plane.isMilitary()) {
                System.out.println(plane);
            }
        }
    }

    public void MilitaryPlanesInAir(Plane[] planArr) {
        for (Plane plane : planArr) {
            if (plane.getHours() > 100) {
                System.out.println(plane);
            }
        }
    }

    public Plane smallestWeightPlane(Plane[] planes) {
        Plane min = planes[0];
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].getWeight() <= min.getWeight()) {
                min = planes[i];
            }
        }
        return min;
    }

    public Plane minimalCostFromMil(Plane[] planes) {
        Plane minCost = null;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary()) {
                if (minCost == null)
                    minCost = planes[i];
                else if (planes[i].getCost() < minCost.getCost()) {
                    minCost = planes[i];
                }
            }

        }
        return minCost;
    }

    public Plane[] orderByYear(Plane[] planes) {
        boolean sortingNeeded = true;
        int countFors = 0;
        while (sortingNeeded) {
            sortingNeeded = false;
            for (int i = 0; i < planes.length - 1 - countFors; i++) {
                if (planes[i].getYear() > planes[i + 1].getYear()) {
                    Plane p = planes[i];
                    planes[i] = planes[i + 1];
                    planes[i + 1] = p;
                    sortingNeeded = true;
                }
            }
            countFors++;
        }
        return planes;
    }


}
