/*Create a class called Student. Write a student manager program to manipulate the 
student information from files by using FileInputStream and FileOutputStream*/
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class p4 {

    public static void main(String[] args) {
        System.out.println("Writing Data");
        try {
            FileOutputStream fout = new FileOutputStream("1.txt");
            String str = "Name : Dhruv, Stream : CSE, Sem : 2th Sem";
            byte b[] = str.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("successful write.");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Retrive Data");
        try {
            System.out.println("Enter file name = ");
            java.util.Scanner sc = new java.util.Scanner(System.in);
            FileInputStream fin = new FileInputStream("2.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}