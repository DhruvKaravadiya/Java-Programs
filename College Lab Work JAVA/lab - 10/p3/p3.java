/*Write an application that reads a file and counts the number of occurrences of digit 5. 
Supply the file name as a command-line argument*/
import java.io.FileInputStream;
import java.io.IOException;
public class p3{
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        char ch;
        int occ5 = 0; 
        int n = fis.available();
        for(int i = 0 ; i < n ; i++){
            ch = (char)fis.read();
            if(ch == '5'){
                occ5++;
            }
        } 
        System.out.println("Total occurances of 5 = "+ occ5);
    }
}