import java.util.Arrays;
import java.util.Scanner;
public class PigLatin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNextLine()) {
            System.out.println(pigLatinBest(s.nextLine()));
        }
        s.close();
    }

    public static String pigLatinSimple(String s) {
        String lower = s.toLowerCase();
        char[] vowels = new char[]{'a','e','i','o','u'};
        if(Arrays.binarySearch(vowels, lower.charAt(0)) >= 0) {
            return lower + "hay";
        } 
        return lower.substring(1) + lower.charAt(0) + "ay";
    }
    
    public static String pigLatin(String s) {
        String lower = s.toLowerCase();
        String[] digraphs = new String[]{"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
        char[] vowels = new char[]{'a','e','i','o','u'};
        if(Arrays.binarySearch(digraphs, lower.substring(0, 2)) >= 0) {
            return lower.substring(2) + lower.substring(0, 2) + "ay";
        }
        if(Arrays.binarySearch(vowels, lower.charAt(0)) >= 0) {
            return lower + "hay";
        }
        return lower.substring(1) + lower.charAt(0) + "ay";
    }

    public static String pigLatinBest(String s){
        String lower = s.toLowerCase();
        if(
            !(lower.charAt(0) >= 'A' && lower.charAt(0) <= 'Z') && 
            !(lower.charAt(0) >= 'a' && lower.charAt(0) <= 'z')
        ) {
            return lower;
        }
        if(
            !(lower.charAt(s.length() - 1) >= 'A' && lower.charAt(s.length() - 1) <= 'Z') && 
            !(lower.charAt(s.length() - 1) >= 'a' && lower.charAt(s.length() - 1) <= 'z') && 
            !(lower.charAt(s.length() - 1) >= '0' && lower.charAt(s.length() - 1) <= '9')
        ) {
            return pigLatin(s.substring(0, s.length() - 1)) + lower.charAt(s.length() - 1);
        }
        return pigLatin(s);
    }
}
