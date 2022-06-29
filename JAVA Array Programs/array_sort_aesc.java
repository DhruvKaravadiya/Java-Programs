//Sorting an ARRAY in Ascending order

public class array_sort_aesc {
    public static void main(String[] args) {

        int a[] = { 5, 7, 2, 3, 6, 8, 1 };
        System.out.println("ORIGINAL ARRAY:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("SORTED ARRAY in Ascending Order:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}