//PRINT THE LARGEST AND SMALLEST ELEMENT OF AN Array

public class larg_small_from_array {
    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
        int max = 0, min = 0;
        max = a[0];
        for (int i = 0; i < a.length; i++) {

            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);
        min = a[0];
        for (int j = 0; j < a.length; j++) {

            if (min > a[j]) {
                min = a[j];
            }
        }
        System.out.println(min);
    }
}