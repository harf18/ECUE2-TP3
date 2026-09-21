package net.lecnam.ecue2.tp3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exec  {

    public static void main(String[] args) {
        Point firstPoint = new Point(3, 3);
        Point secondPoint = new Point(3, 3);

        System.out.println(firstPoint.toString());
        System.out.println(firstPoint.equals(secondPoint) ? "Les deux objets sont identiques" : "Les deux objets sont différents");
        System.out.println("Distance entre A et B : " + firstPoint.retourneDistance(secondPoint));

        System.out.println("\n");

        firstPoint.translate(3, 3);

        System.out.println(firstPoint.toString());
        System.out.println(firstPoint.equals(secondPoint) ? "Les deux objets sont identiques" : "Les deux objets sont différents");
        System.out.println("Distance entre A et B : " + firstPoint.retourneDistance(secondPoint));
    }

}
