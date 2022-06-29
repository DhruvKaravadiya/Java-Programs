//p-1 ADD A TWO DIMESIONAL ARRAY

public class Add_Matrix {
    public static void main(String[] args) {

        
          int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
          int[][] b = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
          int[][] c = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
          
          for (int i = 0; i < a.length; i++) {
          for (int j = 0; j < a[i].length; j++) {
          c[i][j] = a[i][j] + b[i][j];
         System.out.print(c[i][j]+" ");
          }
          System.out.println("");
          }
        }}