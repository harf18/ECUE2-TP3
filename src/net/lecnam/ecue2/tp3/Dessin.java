package net.lecnam.ecue2.tp3;
import java.util.ArrayList;
import java.util.List;


public class Dessin {
    private Rectangle[] rectangles;
    private int nombreRectangles;




    public Dessin(){
        rectangles = new Rectangle[10];
        nombreRectangles = 0;
    }
    // TROUVER un emplacement par rapport au nombre de de rectangle déja placé
    public void ajout(Rectangle rectangle) {
        rectangles[nombreRectangles] = rectangle;
        nombreRectangles++;
    }

    public double retourneSurface() {
        double surfaceTotale = 0;

        for (int i = 0; i < nombreRectangles; i++) {
            surfaceTotale += rectangles[i].RetournSurface();
        }

        return surfaceTotale;
    }

    public void translate(double x, double y) {
        for (int i = 0; i < nombreRectangles; i++) {
            rectangles[i].translate(x, y);
        }
    }

    public Rectangle retournePlusGrandRectangle() {
        Rectangle plusGrand = rectangles[0];

        for (int i = 1; i < nombreRectangles; i++) {
            if (rectangles[i].RetournSurface() > plusGrand.RetournSurface()) {
                plusGrand = rectangles[i];
            }
        }

        return plusGrand;
    }


}

