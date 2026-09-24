package net.lecnam.ecue2.tp3;

public class Exercice1 {
    public static class Point {

        double pointLatitude;
        double pointLongitude;

        public Point(double pointLatitude, double pointLongitude) {
            this.pointLatitude = pointLatitude;
            this.pointLongitude = pointLongitude;
        }

        void translate(double x, double y) {
            this.pointLatitude += x;
            this.pointLongitude += y;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return Double.compare(point.pointLatitude, pointLatitude) == 0 &&
                    Double.compare(point.pointLongitude, pointLongitude) == 0;
        }

        public String toString() {
            return this.pointLatitude + " " + this.pointLongitude;
        }

        public float retourneDistance(Point p) {
            float distance = (float) Math.sqrt((Math.pow((p.pointLongitude - this.pointLongitude),2) + Math.pow((p.pointLatitude - this.pointLatitude),2)));
            return distance;
        }
    }
}
