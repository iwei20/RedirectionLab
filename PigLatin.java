import java.util.Arrays;
import java.util.Scanner;
public class PigLatin {
    public static String pigLatinSimple(String s) {
        String lower = s.toLowerCase();
        char[] vowels = new char[]{'a','e','i','o','u'};
        if(Arrays.binarySearch(vowels, lower.charAt(0)) >= 0) {
            return lower + "hay";
        } 
        return lower.substring(1) + lower.charAt(0) + "ay";
    }
    
}
