/*The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato. 
Write a java program that demonstrates how to establish this class hierarchy. Declare 
one instance variable of type String that indicates the color of a vegetable. Crete and 
display instances of these objects. Override the toString() method of object to return a 
string with the name of vegetable and its color.*/
abstract class Vegetable{
    String color;
    public abstract String toString();
}
class Potato extends Vegetable{
    public String toString(){
       color = "BROWN"; 
        return "potato color--->"+this.color;
    }
}
class Brinjal extends Vegetable{
    public String toString(){
        color = "PURPLE"; 
         return "Brinjal color--->"+this.color;
     }
}
class Tomato extends Vegetable{
    public String toString(){
        color = "RED"; 
         return "Tomato color--->"+this.color;
     }
}
public class p1{
    public static void main(String[] args) {
        Brinjal b = new Brinjal();
        Potato p = new Potato();
        Tomato t = new Tomato();
        System.out.println("Brinjal = "+b+"\nTomato = "+t+"\n Potato = "+p);
    }
}