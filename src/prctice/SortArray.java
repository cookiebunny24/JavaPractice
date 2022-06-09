package prctice;

import java.util.Arrays;

public class SortArray {
    //    A[3,5,7,9,12,34]
//    B[1,3,4,6,7,9,12,13,45]
    public static void main(String[] args) {
        int[] a = {3, 1, 7, 9, 12, 34};
        int[] b = {1, 3, 2, 6, 7, 9, 12, 13, 45};
        int temp = 0;
        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        System.out.println(Arrays.toString(c));
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = i + 1; j < c.length - 1; j++) {
            if(c[i]>c[j]){
                temp=c[j];
                c[j]=c[i];
                c[i]=temp;
                System.out.println(c[i]);
            }

            }

        }
        System.out.println(Arrays.toString(c));

    }
}