/*. Write a program to replace all “word1” by “word2” from a file1, and output is written to 
file2 file and display the no. of replacement*/
public class p2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new FileReader("2.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("1.txt"));
        String line;
        String line2;

        while ((line = br.readLine()) != null) {
            String vars[] = line.split("-");
            String varname = vars[0];
            String replacement = vars[1];

            while ((line2 = br2.readLine()) != null) {
                if (line2.contains(varname)) {
                    line2.replace(varname, replacement);
                }
            }
        }
    }
}
