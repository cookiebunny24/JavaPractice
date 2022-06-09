package prctice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SecLarg {
    public void findIt(String str) {
        Map<String, Integer> baseMap = new HashMap<>();
        String[] charArray = str.split("\\W");
        for (String ch : charArray) {
            if (baseMap.containsKey(ch)) {
                baseMap.put(ch, baseMap.get(ch) + 1);
            } else {
                baseMap.put(ch, 1);
            }
        }
        Set<String> keys = baseMap.keySet();
        for (String ch : keys) {
            if (baseMap.get(ch) > 1) {
                System.out.println(ch + "  is " + baseMap.get(ch) + " times");
            }
        }
    }

    public static void main(String a[]) {
        SecLarg dcf = new SecLarg();
        dcf.findIt("I am Hritik and I am a programmer");
    }
}  