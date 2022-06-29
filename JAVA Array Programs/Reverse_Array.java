//REVERSE A ARRAY AND THEN PRINT THE REVERSED ARRAY

public class Reverse_Array {
    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
        int[] b = { 0, 0, 0, 0, 0, 0, 0 };
        for (int i = 0; i < (a.length); i++) {
            b[(a.length - 1) - i] = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", b[i]);
        }
    }
}