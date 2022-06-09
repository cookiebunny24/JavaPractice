package prctice;

public class MMTR2 {
//    input - 0,1,0,1,0,1,0,0
//output - 0,0,0,0,0,1,1,1
    public  void arrange(int[] arr){
        int j=arr.length-1;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==0 && arr[j]==1){

            }
        }
    }
public static void main(String[] args) {
    MMTR2 m= new MMTR2();
    int[] a= { 0,1,0,1,0,1,0,0};
    m.arrange(a);
}
}
//WebDriver driver = new ChromeDriver();