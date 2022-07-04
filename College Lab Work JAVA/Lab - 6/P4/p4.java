/*Design a class named MyPoint to represent a point with x and y-coordinates. The class 
contains:
- The data fields x and y that represent the coordinates with getter methods.
- A no-arg constructor that creates a point (0, 0).
- A constructor that constructs a point with specified coordinates.
- A method named distance that returns the distance from this point to a specified 
point of the MyPoint type.
- A method named distance that returns the distance from this point to another 
point with specified x- and y-coordinates.*/
class MyPoint{
    double x,y;

    public MyPoint(){
        x=0;
        y=0;
    }
    public MyPoint(double x , double y){
        this.x = x;
        this.y = y;
    }
    public double getDistance(MyPoint mp){
        return (Math.sqrt(Math.pow(this.x-mp.x,2)+Math.pow(this.y-mp.y,2)));
    }
    public double getDistance(double x , double y){
        return (Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2)));
    }
}
public class p4{
    public static void main(String[] args) {
        MyPoint mp1 = new MyPoint();//By default constructor x = 0, y = 0;
        MyPoint mp2 = new MyPoint(1,1);
        MyPoint mp3 = new MyPoint(3,1);
       
        //distance by calling method with object as parameter  
        System.out.println(mp1.getDistance(mp2));
        System.out.println(mp2.getDistance(mp3));

        //distance by calling/invoking method with just point parameters
        System.out.println(mp1.getDistance(1,1));
        System.out.println(mp2.getDistance(3,1));
    }
}