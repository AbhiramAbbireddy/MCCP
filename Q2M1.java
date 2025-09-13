import java.util.Arrays;
import java.util.Scanner;

public class Q2M1 {
    static boolean  charArrays(String s1,String s2) {
        if(s1.length()!=s2.length()) return false;
        char[] cs1 = s1.toCharArray();
        char[] cs2 = s2.toCharArray();
        Arrays.sort(cs1);
        Arrays.sort(cs2);
        return Arrays.equals(cs1, cs2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st string: ");
        String str1=sc.next();
        System.out.println("Enter 2nd string: ");
        String str2=sc.next();
        boolean anagrams=charArrays(str1.toLowerCase(),str2.toLowerCase());
        if(anagrams)
            System.out.println("Both Strings are Anagrams");
        else    
            System.out.println("Both Strings are not Anagrams");
    }
}
