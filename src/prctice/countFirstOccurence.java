package prctice;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

class countFirstOccurence {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        // aaaddddccgggggdda
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
    map.entrySet().forEach(entry ->{
        System.out.println(entry.getKey()+" "+entry.getValue());
        } );

        System.out.println(Collections.singletonList(map));

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }

    }
}