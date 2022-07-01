            //  METHODS OVERLOADING
public class methods{
    static void printSomething() {
        System.out.println("My name is dhruv");
    }
    static void change(int x){
        x = 54;
    }
    static void change2(int []arr){
        arr[0] = 98;
    }
    static void dhruv(){
        System.out.println("dhruv");
    }
    static void dhruv(int g){
        System.out.println("integer ="+" "+g);
    }
    static void dhruv(int g, int h){
        System.out.println(g+","+h);
               
    }
    public static void main(String[] args) {
        //printSomething();
        
       //   Case - 1  Change in integer
       //int x = 45;
       //change(x);
       //System.out.println(x);  
       
       //   Case - 2    Changing the Array
       // int [] a = {1,2,3,4,5};  
       // change2(a);     //   here we are passing the reference of the array
       // System.out.println(a[0]);
      
      // method overloading
        //int a;
       dhruv();
       dhruv(3000);
       dhruv(5,6);
    }
}
 



// Method overloading: Method overloading is process of making with same name but different parameters
    // in method overloading , parameters must be unique and can't be repeated 
    // 