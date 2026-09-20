package net.lecnam.ecue2.tp3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exec  {

    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 0);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("Distance :" + p1.retourneDistance(p2));

        System.out.println("Egalité :" + p1.equals(p2));

        p1.translate(3,4);

        System.out.println(p1);
        System.out.println("Egalité :"+ p1.equals(p2));

        Rectangle rx = new Rectangle(2, 3, 10, 5);
        Rectangle ry = new Rectangle(2, 3, 10, 5);

        System.out.println(rx.equals(ry));


        Dessin dessin = new Dessin();
        Rectangle r1 = new Rectangle(0, 0, 10, 5);
        Rectangle r2 = new Rectangle(5, 5, 8, 6);
        Rectangle r3 = new Rectangle(2, 8, 4, 3);

        dessin.ajout(r1); dessin.ajout(r2); dessin.ajout(r3);

        System.out.println("Surface totale : " + dessin.retourneSurface());

        System.out.println("Plus grand rectangle : " + dessin.retournePlusGrandRectangle());
        dessin.translate(10, 5);
        System.out.println("Plus grand rectangle après déplacement : " + dessin.retournePlusGrandRectangle());
    }

}
