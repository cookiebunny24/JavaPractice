package prctice;

public class seg0_1 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 1};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                temp++;
            }
        }
        for (int j = 0; j < temp; j++) {
            arr[j] = 1;
        }
        for (int j = temp; j < arr.length; j++) {
            arr[j] = 0;
        }
        for (int k=0;k<arr.length;k++){
        System.out.println("array" + arr[k]);
    }
        }
    }
