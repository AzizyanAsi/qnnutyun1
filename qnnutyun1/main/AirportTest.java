package qnnutyun1.main;

import qnnutyun1.model.Plane;
import qnnutyun1.service.PlaneService;

import java.util.Scanner;

public class AirportTest {
    public static void main(String[] args) {
        PlaneService service = new PlaneService();
        Plane p1 = service.create();
        Plane p2 = service.create();
        Plane p3 = service.create();
        Plane[] planes = {p1, p2, p3};


        Scanner s = new Scanner(System.in);
        boolean isMenuActive = true;
        while (isMenuActive) {
            System.out.println("enter command number");
            System.out.println("1.isMilitary  ");
            System.out.println("2. newPlane ");
            System.out.println("3. smallestSeats ");
            System.out.println("4. allNotMilitaryPlanes ");
            System.out.println("5. MilitaryPlanesInAir ");
            System.out.println("6. smallestWeightPlane ");
            System.out.println("7. minimalCostFromMil ");
            System.out.println("8. orderByYear ");
            System.out.println("0. exit");
            int command = s.nextInt();
            switch (command) {
                case 1:
                    service.isMilitary(p1);

                    break;
                case 2:
                    System.out.println(service.newPlane(p1, p2));

                    break;
                case 3:
                    service.smallestSeats(p1, p2, p3);

                    break;
                case 4:
                    service.allNotMilitaryPlanes(planes);

                    break;
                case 5:

                    service.MilitaryPlanesInAir(planes);
                    break;

                case 6:
                    System.out.println(service.smallestWeightPlane(planes));

                    break;
                case 7:

                    System.out.println(service.minimalCostFromMil(planes));
                    break;

                case 8:
                    for (Plane p : service.orderByYear(planes)) {
                        System.out.println(p);

                    }

                    break;


                case 0:
                    isMenuActive = false;
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("invalid number");
            }
        }
    }
}
