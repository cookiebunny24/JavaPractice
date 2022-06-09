package prctice;

import java.util.HashMap;
import java.util.Map;

public class HashData {
    public static void main(String[] args) {
        String str="Life Is Is For Beautiful";
        Map<String,Integer> map= new HashMap<>();
        String[] str1= str.split("\\W");
        for (String st2:str1)
        {
            if(map.containsKey(st2)){
                map.put(st2,map.get(st2)+1);
            }
            else {
                map.put(st2,1);
            }

        }
        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey()+ ""+entry.getValue());
        });
        for (String st2:str1)
             { if(map.get(st2)>1){
                 System.out.println(st2 +"    "+map.get(st2));
             }

        }
       for(Map.Entry<String,Integer> entry:map.entrySet()){
           System.out.println(entry.getKey() +"  "+entry.getValue());
       }
    }
}
