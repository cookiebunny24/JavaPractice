package prctice;

public class Reversal {
    public static void main(String a[]) {
        String str1 = "My name is Heena";
        String[] split = str1.split(str1);
        String temp = "";
        for (int i=0; i <=split.length- 1; i++) {
            temp= split[i];
            for (int j=temp.length()-1;j>=0;j--){
                System.out.print("values---------"+temp.charAt(j));
            }
        }
    }
}