package prctice;

public class MMT {
//
//    A[3,5,7,9,12,34]
//    B[1,3,4,6,7,9,12,13,45]
public static void main(String[] args) {
    int[] a = {3, 5, 7, 9, 12, 34};
    int[] b = {1, 3, 4, 6, 7, 9, 12, 13, 45};
    int sum = a.length + b.length;
    int[] c = new int[sum];
    System.out.println(sum);

    int temp = 0;
    for (int i = 0; i <= a.length - 1; i++) {
        c[i] = a[i];
//        System.out.println(c[i]);
    }
    for (int j = a.length - 1; j <= b.length - 1; j++) {
        c[j] = b[j];
//    System.out.println(c[j]);
    }
//    System.out.println("sorting");

    for (int i = 0; i < c.length - 1; i++) {
        for (int j = i + 1; j < c.length - 1; j++) {
            if (c[i] > c[j]) {
                temp = c[j];
                c[j] = c[i];
                c[i] = temp;
                System.out.println(c[i]);
            }
        }
    }
}
    }
