package net.lecnam.ecue2.tp3;

public class Dessin {

    Object[] tableau; // Utilisation de Object pour stocker à la fois Carre et Rectangle
    int nbFormes;     // Remplacement de nbRec par nbFormes pour plus de sens

    public Dessin(){
        this.tableau = new Object[10];
        this.nbFormes = 0;
    } //Exercice 7

    // Ajout d'un Rectangle
    public void ajout(Rectangle r){
        if (this.nbFormes < this.tableau.length) {
            this.tableau[this.nbFormes] = r;
            this.nbFormes += 1;
        }
    } //Exercice 8

    // Ajout d'un Carre (surcharge de la méthode ajout)
    public void ajout(Carre c){
        if (this.nbFormes < this.tableau.length) {
            this.tableau[this.nbFormes] = c;
            this.nbFormes += 1;
        }
    }

    public double retourneSurface(){
        double surfaceTot = 0;
        for (int i = 0; i < nbFormes; i++){
            if (this.tableau[i] instanceof Rectangle) {
                surfaceTot += ((Rectangle) this.tableau[i]).retourneSurface();
            } else if (this.tableau[i] instanceof Carre) {
                surfaceTot += ((Carre) this.tableau[i]).retourneSurface();
            }
        }
        return surfaceTot;
    }

    public void translate(double x, double y){
        for (int i = 0; i < nbFormes; i++){
            if (this.tableau[i] instanceof Rectangle) {
                ((Rectangle) this.tableau[i]).translate(x, y);
            } else if (this.tableau[i] instanceof Carre) {
                ((Carre) this.tableau[i]).translate(x, y);
            }
        }
    } //Exercice 9

    public Rectangle retournePlusGrandRectangle(){
        Rectangle maxRec = null;
        double surfMaxRec = -1; // Initialisation à -1 pour s'assurer de prendre le premier trouvé

        for (int i = 0; i < nbFormes; i++){
            if (this.tableau[i] instanceof Rectangle) {
                Rectangle r = (Rectangle) this.tableau[i];
                if (r.retourneSurface() > surfMaxRec){
                    maxRec = r;
                    surfMaxRec = r.retourneSurface();
                }
            }
        }
        return maxRec;
    } //Exercice 10

    public Carre retournePlusGrandCarre(){
        Carre maxCarre = null;
        double surfMaxCarre = -1;

        for (int i = 0; i < nbFormes; i++){
            if (this.tableau[i] instanceof Carre) {
                Carre c = (Carre) this.tableau[i];
                if (c.retourneSurface() > surfMaxCarre){
                    maxCarre = c;
                    surfMaxCarre = c.retourneSurface();
                }
            }
        }
        return maxCarre;
    }

}