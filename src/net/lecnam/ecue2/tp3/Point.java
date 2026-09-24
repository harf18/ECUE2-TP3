package net.lecnam.ecue2.tp3;

import java.util.Objects;

public class Point {

    double x, y;

    /*Constructeur Point pour initialiser les points*/
    public Point(double a, double b){
        x = a;
        y = b;
    }

    /*Créer une méthode afin d'ajouter des valeurs aux points*/
    public void translate(double x, double y){
        this.x += x;
        this.y += y;
    }

    /*Définir la méthode equals pour dire quand nos points sont égaux*/
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;

        return Double.compare(x, point.x) == 0 && Double.compare(y, point.y) == 0;
    }

    /*Définir une méthode toString pour afficher nos points*/
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

    /*Créer la méthode retourneDistance qui calcule la distance entre deux points*/
    public double retourneDistance(Point p){
        double differenceX = Math.pow(p.x - this.x, 2);
        double differenceY = Math.pow(p.y - this.y, 2);

        double distance = Math.sqrt(differenceX + differenceY);

        return distance;
    }
}
