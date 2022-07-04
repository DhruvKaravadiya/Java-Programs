import java.util.Scanner;

public class lab_5_p3 {
    public static void main(String[] args) {
        int vowel = 0, consonent = 0,whitespace = 0;
        System.out.println("Enter the string = ");
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.nextLine();
        sc1.close();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'q' && str.charAt(i + 1) == 'u' && str.charAt(i + 2) == 'i' && str.charAt(i + 3) == 't') {
                break;
            } 
            else if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'|| str.charAt(i) == 'u') {
                vowel++;
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                consonent++;
            }
            else{
                whitespace++;
            }
        }
        System.out.println("Vowel = "+vowel);
        System.out.println("Consonent = "+consonent);
        System.out.println("Spaces = "+whitespace);
    }
}
