package net.lecnam.ecue2.tp3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exec  {

    public static void main(String[] args) {

        System.out.println("Exercice Point");

        Point p1 = new Point(1.5,2.6);
        Point p2 = new Point(12,2);

        Point p3 = new Point(1,1);
        p3.translate(0.5,1);

        System.out.println("Test du equal : " + p1.equals(p2));
        System.out.println("Coordonnée du point p3 (avec la translation) : " + p3.toString());
        System.out.print("Distance entre p1 et p2 : " + p1.retourneDistance(p2));

        System.out.println("\nExercice Rectangle");

        Rectangle r1 = new Rectangle(p1,13,5);
        Rectangle r2 = new Rectangle(2,3,13,5);

        r1.translate(0.5,0.4);
        System.out.println("Surface du rectangle 1 : " + r1.retourneSurface());
        System.out.println("r1 contient p2 : " + r1.contient(p2));
        System.out.println("Test du equal : " + r1.equals(r2));
        System.out.println("Test du toString : " + r2.toString());

        System.out.println("\nExercice Dessin");

        Rectangle r3 = new Rectangle(p1, 5, 4);
        Rectangle r4 = new Rectangle(p2, 10, 5);
        Rectangle r5 = new Rectangle(p3, 3, 2);

        Dessin rectangles =new Dessin();

        rectangles.ajout(r1);
        rectangles.ajout(r2);
        rectangles.ajout(r3);
        rectangles.ajout(r4);
        rectangles.ajout(r5);

        System.out.println("Surface totales des rectangles : " + rectangles.retourneSurface());
        Rectangle plusGrandRectangle = rectangles.retournePlusGrandRectangle();

        System.out.println("Information du plus grand rectangle : " + plusGrandRectangle.toString());

        rectangles.translate(2,1);
    }
}
