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
    }

}
