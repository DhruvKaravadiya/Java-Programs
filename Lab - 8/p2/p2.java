/*Write a complete program to accept N integer numbers from the command line. Raise 
and handle exceptions for following cases :
a. - when a number is –ve
b. - when a number is evenly divisible by 10
c. - when a number is greater than 1000 and less than 2000
d. - when a number is greater than 7000
Skip the number if an exception is raised for it, otherwise add it to find total sum*/
class NumberDivisibleBy10Exception extends Exception{ 
    void method1(int ...intArr){
        for (int k = 0; k < intArr.length; k++) {
            try {
                if (intArr[k] / 10 == 0){
                    throw new NumberDivisibleBy10Exception(); 
                                       
                }
            } catch (NumberDivisibleBy10Exception ndb10e) {
                ndb10e.printStackTrace();
                System.out.println("NumberDivisibleBy10Exception");
            }
        }
    }
}
class NumberNegativeException extends Exception{ 
    void method1(int ...intArr){
        for (int k = 0; k < intArr.length; k++) {
            try {
                if (intArr[k]< 0){
                    throw new NumberNegativeException(); 
                                       
                }
            } catch (NumberNegativeException nne) {
                nne.printStackTrace();
                System.out.println("NumberNegativeException");
            }
        }
    }
}
class NumberBet1000and2000 extends Exception{ 
    void method1(int ...intArr){
        for (int k = 0; k < intArr.length; k++) {
            try {
                if (intArr[k] >1000 && intArr[k] <2000){
                    throw new NumberBet1000and2000(); 
                                       
                }
            } catch (NumberBet1000and2000 nb1000a2000) {
                nb1000a2000.printStackTrace();
                System.out.println("NumberBet1000and2000");
            }
        }
    }
}class NumberGreaterthan7000 extends Exception{ 
    void method1(int ...intArr){
        for (int k = 0; k < intArr.length; k++) {
            try {
                if (intArr[k] >7000){
                    throw new NumberGreaterthan7000(); 
                                       
                }
            } catch (NumberGreaterthan7000 nbgt7000) {
                nbgt7000.printStackTrace();
                System.out.println("NumberGreaterthan7000");
            }
        }
    }
}
public class p2 {
    public static void main(String[] args) {
        int[] N = new int[args.length];
        NumberDivisibleBy2Exception e = new NumberDivisibleBy2Exception();
        NumberBet1000and2000 x = new NumberBet1000and2000();
        NumberGreaterthan7000 q = new NumberGreaterthan7000();
        NumberNegativeException o = new NumberNegativeException();
       
        for (int i = 0; i < args.length; i++) {
            N[i] =Integer.parseInt(args[i]);
            e.method1(N[i]);
            x.method1(N[i]);     
            q.method1(N[i]);
            o.method1(N[i]);
        }   
    }
}
