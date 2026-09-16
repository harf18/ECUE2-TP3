package net.lecnam.ecue2.tp3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exec  {

    public static void main(String[] args) {
        Point ptn1 = new Point(12.5, 64.85);
        Point ptn2 = new Point(10, 20);
        Point ptn3 = new Point(10, 20);


        System.out.println("Ptn1 de base.");
        System.out.println(ptn1 + "\n");


        ptn1.translate(12.45, 33.33);
        System.out.println("Ptn1 après méthode translate");
        System.out.println(ptn1);

        System.out.println("Compare ptn2 et ptn3");
        System.out.println("ptn2 - " + ptn2);
        System.out.println("ptn3 - " + ptn3);
        System.out.println(ptn2.equals(ptn3) ? "ptn2 et ptn3 sont identitque" : "ptn2 et ptn3 sont différent");
        System.out.println();

        System.out.println("compare Ptn2 après méthode translate");
        ptn2.translate(12.45, 25);
        System.out.println("ptn2 - " + ptn2);
        System.out.println("ptn3 - " + ptn3);
        System.out.println(ptn2.equals(ptn3) ? "ptn2 et ptn3 sont identitque" : "ptn2 et ptn3 sont différent");
        System.out.println();

        System.out.println("Distance entre ptn1 et ptn2");
        System.out.println("ptn1 - " + ptn1);
        System.out.println("ptn2 - " + ptn2);
        System.out.println("Distance : " + ptn1.retourneDistance(ptn2));

        //Rectangle class test ===============================================================
        Rectangle rect1 = new Rectangle(ptn3, 20, 55);
        Rectangle rect2 = new Rectangle(25, 25, 10, 30);

        System.out.println("Surface rect1 : " + rect1.retourneSurface());
        System.out.println("Surface rect2 : " + rect2.retourneSurface());




    }

}
