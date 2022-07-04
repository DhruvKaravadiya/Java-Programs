/* Define class for Complex number with real and imaginary as data members. Create its 
contructor, overload the constructors. Also define addition method to add two complex 
objects*/
class Complex{
    static double R;
    static double I;
    public Complex(double R, double I){
        this.R = R;
        this.I = I;
    }
    public Complex(Complex cx){
        super(R, I);
    }
    public static Complex addition(Complex c1 , Complex c2){
        Complex c = new Complex(0, 0);
       c.R= c1.R + c2.R;
       c.I= c1.I + c2.I;
       return c;
    }
    public static void main(String[] args){
        Complex cx1 = new Complex(2,3);
        Complex cx2 = new Complex(2,3);
        Complex x = addition(cx1, cx2);
        System.out.println(c.R+"+i"+c.I);
    }
}