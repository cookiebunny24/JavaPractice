package prctice;

public class Interview {
//    A[1,3,5,7,9,12]

    public static void main(String[] args) {
        int[] abc={1,3,5,7,9,12};
        int multiple=1;
        for(int i=0; i<= abc.length-1;i++){
            multiple=multiple*abc[i];
        }
        System.out.println("product-----"+multiple);
   for(int j=0; j<= abc.length-1;j++){
       abc[j]=multiple/abc[j];
        System.out.println("values---"+abc[j]);
   }
    }
}
