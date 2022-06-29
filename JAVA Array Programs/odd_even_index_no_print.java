//Print the elements at even and odd indexes of array
public class odd_even_index_no_print {
    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Elements at even indexes are = ");
        for (int i = 0; i < a.length; i = i + 2) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Elements at odd indexes are = ");
        for (int j = 1; j < a.length; j = j + 2) {
            System.out.print(a[j] + " ");
        }
    }
}