package net.lecnam.ecue2.tp3;

public class Exec4 {

    public static void main(String[] args) {

        Dessin d = new Dessin();

        Rectangle r1 = new Rectangle(1, 1, 1, 1);
        Rectangle r2 = new Rectangle(2, 2, 2, 2);
        Rectangle r3 = new Rectangle(4, 4, 4, 4);
        Rectangle r4 = new Rectangle(3, 3, 3, 3);
        d.ajout(r1);
        d.ajout(r2);
        d.ajout(r3);
        d.ajout(r4);
        System.out.println(d.retourneSurface());
        System.out.println("Voici le plus grand rectangle du dessin : ");
        System.out.println(d.retournePlusGrandRectangle().toString());
        d.translate(2, 2);
        System.out.println("Voici le plus grand rectangle du dessin : ");
        System.out.println(d.retournePlusGrandRectangle().toString());

    }

}
