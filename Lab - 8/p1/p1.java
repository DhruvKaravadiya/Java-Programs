/*Write a method for computing x^y doing repetitive multiplication. X and y are of type 
integer and are to be given as command line arguments. Raise and handle exception(s) 
for invalid values of x and y.*/

public class p1{
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = 1;
        try{
            for(int i = 0 ; i < y ; i++){
                z = z*x;
            }
            System.out.println(z);
        }
        catch(NumberFormatException nfe){
            System.out.println("NumberFormatException - Entered number must be of type integer taken in argument");
        }
    }
}