package net.lecnam.ecue2.tp3;

public class Exec {
    public static void main(String[] args) {

        Dessin dessin = new Dessin();

        Exercice2.Rectangle rectangle1 =
                new Exercice2.Rectangle(2, 2, 3, 4);

        Exercice2.Rectangle rectangle2 =
                new Exercice2.Rectangle(5, 5, 6, 7);

        Exercice1.Point point = new Exercice1.Point(10,5);

        Carre carre1 =
                new Carre(point, 10);

        Carre carre2 =
                new Carre(point, 20);

        dessin.ajout(rectangle1);
        dessin.ajout(rectangle2);
        dessin.ajout(carre1);
        dessin.ajout(carre2);

        System.out.println("Surface rectangle 1 : " + rectangle1.Surface());

        System.out.println("Surface rectangle 2 : " + rectangle2.Surface());

        System.out.println("Surface carré 1 : " + carre1.Surface());

        System.out.println("Surface carré 2 : " + carre2.Surface());

        System.out.println();
        System.out.println("Surface totale : "
                + dessin.retourneSurface());

        System.out.println();
        System.out.println("Plus grand rectangle :");
        System.out.println(dessin.retournePlusGrandRectangle());

        System.out.println();
        System.out.println("Plus grand carré :");
        System.out.println(dessin.retournePlusGrandCarre());

        dessin.translate(10, 10);

        System.out.println();
        System.out.println("Après déplacement :");

        System.out.println("Plus grand rectangle :");
        System.out.println(dessin.retournePlusGrandRectangle());

        System.out.println("Plus grand carré :");
        System.out.println(dessin.retournePlusGrandCarre());

        System.out.println();
        System.out.println("Toutes les formes du dessin :");
        System.out.println(dessin);
    }
}
