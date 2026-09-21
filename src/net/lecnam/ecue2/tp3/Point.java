package net.lecnam.ecue2.tp3;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void translate(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public static void main(String[] args) {

        // Création d'un point
        Point point = new Point(3, 2);

        System.out.println("Création du point :");
        System.out.println("Le point créé est : " + point);

        // Translation du point
        System.out.println();
        System.out.println("Translation du point de (2, 3) :");
        point.translate(2, 3);
        System.out.println("Le point après translation est : " + point);

        // Création d'un deuxième point
        Point point2 = new Point(5, 5);

        System.out.println();
        System.out.println("Création d'un deuxième point :");
        System.out.println("Le deuxième point est : " + point2);

        // Test de l'égalité
        System.out.println();
        System.out.println("Test de l'égalité des deux points :");
        System.out.println("Les deux points sont-ils égaux ? " + point.equals(point2));

        // Calcul de la distance
        System.out.println();
        System.out.println("Calcul de la distance entre les deux points :");
        System.out.println("La distance entre les deux points est : "
                + point.retourneDistance(point2));
    }

    // Décrit le point
    @Override
    public String toString() {
        return "Point{x=" + x + ", y=" + y + "}";
    }

    // Calcule la distance entre deux points
    public double retourneDistance(Point p) {
        double differenceX = this.x - p.x;
        double differenceY = this.y - p.y;

        return Math.sqrt(differenceX * differenceX + differenceY * differenceY);
    }
}
