package prctice;

public class Greatest {
    public static void main(String[] args) {
        Greatest gt= new Greatest();
        int[] num= new int[5];
        num = new int[]{3, 56, 78, 89,56, 100, 11, 12};
        int max=num[0];
        for (int i=0;i< num.length-1;i++){
            if(num[i]>=max){
                max=num[i];
            }
        }
        System.out.println(max);
    }
}
