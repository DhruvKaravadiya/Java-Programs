/*Write a program to create circle class with area function to find area of circle.*/

import java.util.Scanner;
public class lab_5_p1{
    static double circle(double radius){
        return 3.14*radius*radius;
    }
    public static void main(String[] args) {
        System.out.println("Enter the radius = ");
        Scanner sc1 = new Scanner(System.in);
        int R = sc1.nextInt();
        System.out.println(circle(R));
    }
}