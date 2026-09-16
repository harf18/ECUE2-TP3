package net.lecnam.ecue2.tp3;

public class Point  {

        double x, y;

        public Point(double abscisse, double ordonnee) {

            this.x = abscisse;
            this.y = ordonnee;

        }

        public boolean equals(Object p){

            Point point = (Point) p;

            return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;



        }

        public String toString() {
            return "Point(x=" + x + ", y=" + y + ")";
        }


        public double retourneDistance(Point p) {
            double deltaX = this.x - p.x;
            double deltaY = this.y - p.y;
            return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        }
}
