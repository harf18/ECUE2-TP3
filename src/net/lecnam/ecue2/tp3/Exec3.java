package net.lecnam.ecue2.tp3;

public class Exec3 {

    public static void main(String[] args) {

        Dessin d = new Dessin();

        Rectangle r1 = new Rectangle(1, 1, 1, 1);
        Rectangle r2 = new Rectangle(2, 2, 2, 2);
        d.ajout(r1);
        d.ajout(r2);
        System.out.println(d.retourneSurface());
        d.translate(2, 2);
        System.out.println(d.tableau[0].toString());
        System.out.println("Voici le plus grand rectangle du dessin : ");
        System.out.println(d.retournePlusGrandRectangle().toString());

    }

}
