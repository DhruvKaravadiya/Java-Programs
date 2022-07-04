/*Write a program to accept a line and check how many consonants and vowels are there 
in line*/
import java.util.Scanner;
public class lab_4_p1 {
    public static void main(String[] args) {
        System.out.println("Enter the string = ");
        int vowel = 0;
        int consonent = 0;
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.nextLine();
        str = str.toLowerCase();
        sc1.close();
        for (int i = 0; i <str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u')
                vowel++;

            else if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))
                consonent++;

            }
        System.out.println(vowel+" Vowels");
        System.out.println(consonent+" Consonents");
    }
}