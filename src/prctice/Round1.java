package prctice;

import java.util.HashMap;
import java.util.Map;

public class Round1 {
//    given set of intervals be {{1,3}, {2,4}, {5,7}, {6,8}}.
//    The intervals {1,3} and {2,4} overlap with each other,
//    so they should be merged and become {1, 4}. Similarly, {5, 7} and
//    {6, 8} should be merged and become {5, 8}
//{{1,3}.{2,5}}=>{{1,5}}
    public void range() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,3);
        map.put(2,4);
        map.put(5,7);
        map.put(6,8);
        for (Map.Entry<Integer, Integer> entry:map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            for (int i = entry.getKey(); i <= entry.getValue(); i++) {
                while (entry.getKey() != entry.getValue()) {
                    map.put(entry.getKey(), entry.setValue(i));
                    System.out.println(entry.getKey() + "    " + entry.getValue());
                }
            }
        }
        map.entrySet().forEach(entry -> System.out.println(entry.getKey()+  "    "+ entry.getValue()));

    }
    public static void main(String[] args) {
      Round1 r1= new Round1();
      r1.range();
    }
}
