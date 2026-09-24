package net.lecnam.ecue2.tp3;

public class Exercice2 {
    public static class Rectangle {

        double longueur1;
        double longueur2;
        double x;
        double y;

        public Rectangle(Exercice1.Point Point, double longueur1, double longueur2) {
            this.x = Point.pointLongitude;
            this.y = Point.pointLatitude;
            this.longueur1 = longueur1;
            this.longueur2 = longueur2;
        }

        public Rectangle(double x, double y, double longueur1, double longueur2){
            this.x = x;
            this.y = y;
            this.longueur1 = longueur1;
            this.longueur2 = longueur2;
        }

        public double Surface(){
            return this.longueur2 * this.longueur1;
        }

        void translate(double x, double y){
            this.x += x;
            this.y += y;
        }

        boolean contient(Exercice1.Point p) {
            if ((this.x - this.longueur2) < p.pointLongitude && p.pointLongitude < this.x || (this.y + this.longueur1) > p.pointLatitude && this.y < p.pointLatitude){
                return true;
            } else {
                return false;
            }
        }

        boolean equals(Rectangle r) {
            if (this == r) return true;
            if (r == null || getClass() != r.getClass()) return false;
            Rectangle rectangle = (Rectangle) r;
            return Double.compare(rectangle.x,x) == 0 &&
                    Double.compare(rectangle.y,y) == 0 &&
                    Double.compare(rectangle.longueur1,longueur1) == 0;

        }

        public String toString() {
            return "Le rectangle de longeur " + this.longueur1 + " et " + this.longueur2 + " a une surface de " + Surface();
        }

    }
}
