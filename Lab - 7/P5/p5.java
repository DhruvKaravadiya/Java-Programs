/*The Transport interface declares a deliver () method. The abstract class Animal is the 
super class of the Tiger, Camel, Deer and Donkey classes. The Transport interface is 
implemented by the Camel and Donkey classes. Write a test program that initialize an 
array of four Animal objects. If the object implements the Transport interface, the 
deliver () method is invoked*/

interface Transport{
    void deliver();
}
abstract class Animal{

}
class Tiger extends Animal{
    void display(){
        System.out.println("Tiger");
    }
}
abstract class Camel extends Animal implements Transport{
    void display(){
        System.out.println("Camel");
    }
}
class Deer extends Animal{
    void display(){
        System.out.println("Deer");
    }
}
abstract class Donkey extends Animal implements Transport{
    void display(){
        System.out.println("Donkey");
    }
} 
public class p5 {
    public static void main(String[] args) {
      Camel C = new Camel();
      C.deliver();  
    }
}
