package net.lecnam.ecue2.tp3;

public class Exec2 {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(5, 6, 7, 8);

        Point p = new Point(5, 6);
        Rectangle r2 = new Rectangle(p, 7, 8);

        System.out.println(r1.equals(r2) ? "r1 et r2 identiques" : "ri et r2 différents");

        System.out.println(r1.retourneSurface());
        System.out.println(r2.retourneSurface());

        r2.translate(3, 2);

        Point p2 = new Point(7, 7);
        System.out.println(r2.contient(p2) ? "Le rectangle contient le point" : "Le rectangle ne contient pas le point");

        System.out.println(r2.toString());

    }

}
