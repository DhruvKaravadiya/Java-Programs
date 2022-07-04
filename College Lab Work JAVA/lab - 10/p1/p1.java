import java.io.FileInputStream;
import java.io.IOException;
/*Write a program that counts number of characters, words, and lines in a file. Use 
exceptions to check whether the file that is read exists or not*/
public class p1 {
  public static void main(String[] args) throws IOException{
      
      FileInputStream f = new FileInputStream(args[0]);     //Input file name by command line input
      int charCount = f.available();        
      char ch;
      int wordCount = 0 ;
      int lineCount = 0 ;
      int n = charCount;
      for(int i = 0 ; i < n ; i++){
        if((char)f.read() == '\n'){
            lineCount++;
        }
        else if((char)f.read() == ' '){
            wordCount++;
        }
      }
      System.out.println("Total characters = "+charCount);
      
      System.out.println("Total Words = "+wordCount);
      
      System.out.println("Total Line = "+lineCount);
  }  
}
