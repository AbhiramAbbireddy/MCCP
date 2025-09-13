import java.util.Scanner;

public class Q2M5 {
    static boolean twoFreqArrays(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(char c : s1.toCharArray()) {
            freq1[c-'a']++;
        }
        for(char c : s2.toCharArray()) {
            freq2[c-'a']++;
        }
        for(int i=0;i<26;i++) {
            if(freq1[i]!=freq2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string: ");
        String str1 = sc.next();
        System.out.println("Enter 2nd string: ");
        String str2 = sc.next();
        boolean anagrams = twoFreqArrays(str1.toLowerCase(), str2.toLowerCase());
        if (anagrams)
            System.out.println("Both Strings are Anagrams");
        else
            System.out.println("Both Strings are not Anagrams");
    }
}
