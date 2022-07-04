/*Write a program that illustrates interface inheritance. Interface A is extended by A1 
and A2. Interface A12 inherits from both P1 and P2.Each interface declares one 
constant and one method. Class B implements A12.Instantiate B and invoke each of 
its methods. Each method displays one of the constants*/
interface A {
   final int intA = 1;
   void printA();
}

interface A1 extends A {
    final int intA = 2;
    void printA1();
}

interface A2 extends A {
    final int intA = 3;
    void printA2();
}

interface A12 extends A1, A2 {
    final int intA = 4;
    void printA12();
}

class B implements A12 {
    public void printA() {
        System.out.println(intA);
    }

    public void printA1() {
        System.out.println(A1.intA);
    }

    public void printA2() {
        System.out.println(A2.intA);
    }

    public void printA12() {
        System.out.println(A12.intA);
    }

}
public class p2{
    public static void main(String[] args) {
        B object = new B();
        object.printA();
        object.printA2();
        object.printA2();
        object.printA12();

    }
}