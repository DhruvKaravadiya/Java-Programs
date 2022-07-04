/*. Write a program to check that whether the name given from command line is file or 
not? If it is a file then print the size of file and if it is directory then it should display the 
name of all files in it*/
import java.io.File;
public class p2{
    public static void main(String[] args) {
        File f = new File(args[0]);

        if(f.isFile() && f.exists()){
            System.out.println((double)f.length()/ 1024+" kbs");
        }
        else if(f.isDirectory() && f.exists()){
            System.out.println(f.list());
        }
    }
}