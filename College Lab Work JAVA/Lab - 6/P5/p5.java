/*Create a class named ThreeDPoint to model a point in a three-dimensional space. Let 
ThreeDPoint be derived from MyPoint with following additional features:
- A data fields named z that represents the z-coordinate.
- A no-arg constructor that creates a point (0, 0, 0).
- A constructor that constructs a point with three specified coordinates.
- A get method that returns the z value.
- Override the distance method to return the distance between two points in the 
three-dimensional space.
- Write a program that creates two points (0, 0, 0) and (10, 30, 25.5) and display the 
distance between the two points.*/

class ThreeDPoint {
    double x, y, z;

    public ThreeDPoint() {
        x = 0;
        y = 0;
        z = 0;
    }

    public ThreeDPoint(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getDistance(ThreeDPoint pt) {
        return (Math.sqrt(Math.pow(this.x - pt.x, 2)) + (Math.pow(this.y - pt.y, 2)) + (Math.pow(this.z - pt.z, 2)));
    }

    public double getDistance(double x, double y, double z) {

        return (Math.sqrt(Math.pow(this.x - x, 2)) + (Math.pow(this.y - y, 2)) + (Math.pow(this.z - z, 2)));
    }
}

public class p5 {
    public static void main(String[] args) {
        ThreeDPoint p0 = new ThreeDPoint();
        ThreeDPoint p1 = new ThreeDPoint(1, 1, 1);
        ThreeDPoint p2 = new ThreeDPoint(2, 3, 4);

        // distance by calling/invoking method with just point parameters
        System.out.println(p0.getDistance(1, 1, 1));
        System.out.println(p1.getDistance(2, 3, 4));

        // distance by calling method with object as parameter
        System.out.println(p0.getDistance(p1));
        System.out.println(p1.getDistance(p2));
    }
}
