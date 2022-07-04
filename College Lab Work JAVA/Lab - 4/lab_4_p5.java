/*Write an application that searches through its command-line argument. If an argument 
is found that does not begin with and upper case letter, display error message and 
terminate.*/
public class lab_4_p5 {
    public static void main(String[] args) {
        String str = args[0];
        for (int i = 0; i < str.length();i++) {
            if ((str.charAt(0) >= 'A' && str.charAt(0) <= 'Z')) {
               System.out.println("Success");
               break;
            }
            else{
                System.out.println("ERROR");
                break;
            }
        }
    }
}
