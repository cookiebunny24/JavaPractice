package prctice;// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class Helloworld {
    public static void main(String[] args) {
        // System.out.println("Hello, World!"); 
        // aaaddddccgggggdda
        // a3d4c2g5d2a1
        String str="aaaddddccgggggdda";
        char[] c=str.toCharArray();
        Map<Character,Integer> map= new HashMap<Character,Integer>();
        for( Character ch:c)
        {
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
                // System.out.println(ch);
            }
            else{
                map.put(ch,1);
            }
        }

        for (Character i : map.keySet())

        {
            System.out.print(i+""+map.get(i)+"");
        }

    }
}