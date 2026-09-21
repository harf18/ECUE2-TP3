package net.lecnam.ecue2.tp3;

public class Dessin {

    Rectangle[] rectangles = new Rectangle[10];
    int nombreRectangles = 0;

    // Exercice 8 : ajouter un rectangle
    public void ajout(Rectangle rectangle) {
        rectangles[nombreRectangles] = rectangle;
        nombreRectangles++;
    }

    // Exercice 9 : surface totale
    public double retourneSurface() {

        double surface = 0;

        for (int i = 0; i < nombreRectangles; i++) {
            surface += rectangles[i].retourneSurface();
        }

        return surface;
    }

    // Exercice 9 : déplacer tous les rectangles
    public void translate(double x, double y) {

        for (int i = 0; i < nombreRectangles; i++) {
            rectangles[i].translate(x, y);
        }
    }

    // Exercice 10 : trouver le plus grand rectangle
    public Rectangle retournePlusGrandRectangle() {

        Rectangle plusGrand = rectangles[0];

        for (int i = 1; i < nombreRectangles; i++) {

            if (rectangles[i].retourneSurface() > plusGrand.retourneSurface()) {
                plusGrand = rectangles[i];
            }
        }

        return plusGrand;
    }
}