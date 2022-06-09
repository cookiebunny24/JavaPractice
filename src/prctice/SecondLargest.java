package prctice;

public class SecondLargest {
    public static void main(String[] args) {
        int[] a= {3,4,87,89,90};
        int largest=a[0],secondLargest=a[0];

        for (int i=0;i<=a.length-1;i++){
            if(a[i]>=largest){
                secondLargest=largest;
                largest=a[i];
            }
        }
        System.out.println("largest"+largest+"    "+"secondlargest"+secondLargest);
    }
}
