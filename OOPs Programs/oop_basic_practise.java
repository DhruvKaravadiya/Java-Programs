//import java.util.Scanner;
/*  class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setname(String str){
        name = str;
    }
}
class cellPhone{
    public void ringing(){
        System.out.println("RINGING");
    }
    public void vibrating(){
        System.out.println("VIBRATING");
    }
    public void silent(){
        System.out.println("SILENT"); 
    }         
}   */
class Square{
    int side;
    public int area(){
       return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class oop_basic_practise {
    public static void main(String[] args) {
        // p1
       /* Employee e1 = new Employee();
        // First way to print
        // e1.setname("Dhruv Karavadiya");
        //  System.out.println(e1.getName());
       
        //Second Way to print
        e1.name = "dhruv";
        System.out.println(e1.name);
        
        e1.salary = 233333;
        System.out.println(e1.salary);      */

        //p2
       /* cellPhone asus = new cellPhone();
        System.out.println("DAIL!!\n1-ring\n2-vibrate \n3-silent \n4-cancel");
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();
        if(x == 1)
            asus.ringing();

        else if(x == 2)
            asus.vibrating();

        else if(x == 3)
            asus.silent();        

        else if(x == 4)
            System.out.println("Call Cancelled");

        else
            System.out.println("Invalid Input"); 
            */
        // p3
        Square sq1 = new Square();
        sq1.side = 5;
        System.out.println("Perimeter = "+sq1.perimeter());
        System.out.println("Area = "+sq1.area());
    } 
}