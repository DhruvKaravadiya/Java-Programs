/* Refine the student manager program to manipulate the student information from files 
by using the BufferedReader and BufferedWriter*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class p1 {

    public static void main(String[] args) throws Exception {
        try{
            BufferedReader bufRead = new BufferedReader(new FileReader(args[0]));
            BufferedWriter bufWrite = new BufferedWriter(new FileWriter(args[1]));
            int i;
            // manipulate the student information from files
            do {
                i = bufRead.read();
                if (i != -1) {
                    if (Character.isUpperCase((char) i)) {
                        bufWrite.write(Character.toLowerCase((char) i));
                    } else {
                        bufWrite.write((char) i);
                    }
                }
            } while (i != -1);
        bufRead.close();
        bufWrite.close();
        } 
        catch(FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }
    }
} 
        
  