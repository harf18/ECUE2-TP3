package net.lecnam.ecue2.tp3;

public class Exec  {

    public static void main(String[] args) {
        /*Créer un dessin*/
        Dessin d1 = new Dessin();

        System.out.println("Dessin initialisé");

        /*Créer plusieurs rectangles*/
        Rectangle r1 = new Rectangle(1,2,4,6);
        Rectangle r2 = new Rectangle(4,6,3,2);
        Rectangle r3 = new Rectangle(0,3,5,7);

        System.out.println("Les rectangles ont étés créé");

        /*Mettre les rectangles dans le dessin*/
        d1.ajout(r1);
        d1.ajout(r2);
        d1.ajout(r3);

        System.out.println("Les rectangles ont étés ajoutés au dessin !");

        /*Afficher la surface globale des rectangles*/
        double surface = d1.retourneSurface();
        System.out.println("La surface globale de tout les rectangles est : " + surface);

        /*Afficher les informations du plus grand rectangle*/
        System.out.println("Le plus grand rectangle du dessin est : " + d1.retournePlusGrandRectangle());

        /*Déplacer les rectangles*/
        d1.translate(5,2);

        /*Afficher les informations du plus grand rectangle*/
        System.out.println("Le plus grand rectangle du dessin est : " + d1.retournePlusGrandRectangle());

    }

}
