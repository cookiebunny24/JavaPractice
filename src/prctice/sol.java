package prctice;

import java.util.Scanner;

public class sol {
        public static void main(String a[]) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter string name");
            String str1=sc.nextLine();
//            String str1 = "My name is Heena";
            String[] split = str1.split(" ");
            String temp = "";
            for (int i=0; i<split.length; i++)
            {
                temp = split[i];
                System.out.print(" ");
                for (int j=temp.length()-1;j>=0;j--)
                {
                    System.out.print(temp.charAt(j));
                }
            }
        }
    }
