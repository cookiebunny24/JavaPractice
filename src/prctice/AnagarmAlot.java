package prctice;

import java.util.Arrays;
import java.util.Comparator;

public class AnagarmAlot implements Comparator<String> {
    public String sortChars(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        System.out.println(content);
        return new String(content);
    }

    public int compare(String s1, String s2) {
        return sortChars(s1).compareTo(sortChars(s2));
    }

    public static void main(String[] args) {
        String[] strings = {"xyz", "ca", "ab", "ac", "ba", "zyx"};
        AnagarmAlot comparator = new AnagarmAlot();
        Arrays.sort(strings, comparator);
    }
}
