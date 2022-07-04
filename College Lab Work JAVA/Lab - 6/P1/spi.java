/*Declare a class called student having following data members:id_no, 
no_of_subjects_registered, subject_code, subject_credits, grade_obtained and spi. 
Define constructor and calculate_spi methods.Define main to instantiate an array for 
objects of class student to process data of n students to be given as command line 
arguments.*/
import java.util.Scanner;

class student {
    int id_no;
    int no_of_subjects_registered;
    int[] subject_code = new int[6];
    int[] subject_credits;
    String[] grade_obtained = new String[10];
    double spi;
    int[] grade_point = new int[10];
    int sum = 0;
    int sum1 = 0;

    student() {
        no_of_subjects_registered = 6;

        subject_code[0] = 5001;
        subject_credits[0] = 6;
        subject_code[1] = 5002;
        subject_credits[1] = 6;
        subject_code[2] = 5003;
        subject_credits[2] = 4;
        subject_code[3] = 5003;
        subject_credits[3] = 4;
        subject_code[4] = 5004;
        subject_credits[4] = 2;
        subject_code[5] = 5005;
        subject_credits[5] = 2;
    }
    
    void spi_calculator() {
        for (int i = 0; i < 6; i++) {
            if (grade_obtained[i].equals("A+"))
                grade_point[i] = 10;
            else if (grade_obtained[i].equals("A"))
                grade_point[i] = 9;
            else if (grade_obtained[i].equals("B+"))
                grade_point[i] = 8;
            else if (grade_obtained[i].equals("B"))
                grade_point[i] = 7;
            else if (grade_obtained[i].equals("C+"))
                grade_point[i] = 6;
            else if (grade_obtained[i].equals("C"))
                grade_point[i] = 5;
            else if (grade_obtained[i].equals("F"))
                grade_point[i] = 0;

            this.sum = sum + (subject_credits[i] * grade_point[i]);
            this.sum1 = sum1 + subject_credits[i];
        }
        spi = sum / sum1;
        System.out.println("SPI = " + spi);
    }
}
public class spi {
    public static void main(String[] args) {
        System.out.println("Enter grades : ");
        Scanner sc1 = new Scanner(System.in);
        student stud1 = new student();
        for (int i = 0; i < 6; i++) {
            String str = sc1.nextLine();
            stud1.grade_obtained[i] = str;
        }
        stud1.spi_calculator();
    }
}
