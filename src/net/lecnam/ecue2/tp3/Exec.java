package net.lecnam.ecue2.tp3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Exec {

    public static void main(String[] args) {

        // 1. Instancier un objet Dessin
        Dessin dessin = new Dessin();

        // 2. Créer plusieurs rectangles
        Rectangle r1 = new Rectangle(0, 0, 10, 5);
        Rectangle r2 = new Rectangle(2, 3, 4, 8);
        Rectangle r3 = new Rectangle(5, 5, 6, 6);

        // 3. Ajouter les rectangles au dessin
        dessin.ajout(r1);
        dessin.ajout(r2);
        dessin.ajout(r3);

        // 4. Afficher la surface totale
        System.out.println("Surface totale : " + dessin.retourneSurface());

        // 5. Afficher les informations du plus grand rectangle
        System.out.println("Plus grand rectangle : "
                + dessin.retournePlusGrandRectangle());

        // 6. Déplacer tous les rectangles
        dessin.translate(10, 5);

        // 7. Afficher à nouveau le plus grand rectangle
        System.out.println("Après déplacement : "
                + dessin.retournePlusGrandRectangle());
    }
}