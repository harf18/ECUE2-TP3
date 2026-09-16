package net.lecnam.ecue2.tp3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exec  {

    public static void main(String[] args) {

        System.out.println("Exercice 1");

        Point p1 = new Point(1.5,2.6);
        Point p2 = new Point(12,2.6);

        Point p3 = new Point(1,1);
        p3.translate(0.5,1);

        System.out.println("Test du equal : " + p1.equals(p2));
        System.out.println("Coordonnée du point p3 (avec la translation) : " + p3.toString());
        System.out.print("Distance entre p1 et p2 : " + p1.retourneDistance(p2));

    }

}
