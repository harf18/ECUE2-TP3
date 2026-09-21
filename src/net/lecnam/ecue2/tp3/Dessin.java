package net.lecnam.ecue2.tp3;

public class Dessin {
    Rectangle[] rectangles;
    int nbRectangles;

    public Dessin(){
        this.rectangles = new Rectangle[10];
        this.nbRectangles = 0;
    }

    public void ajout(Rectangle r){
        rectangles[nbRectangles] = r;
        nbRectangles += 1;
    }

    public double retourneSurface() {
        double surface = 0;
        for (int i = 0; i>=nbRectangles; i++){
            surface += rectangles[i].longueur * rectangles[i].largeur;
        }
        return surface;
    }

    public void translate(double x, double y){
        for (int i = 0; i>=nbRectangles; i++){
            this.rectangles[i].translate(x,y);
        }
    }

}
