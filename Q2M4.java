import java.util.Scanner;

public class Q2M4 {
    static boolean  singleHashMaps(String s1,String s2) {
        if(s1.length()!=s2.length()) return false;
        int[] freqbool=new int[26];
        for(int i=0;i<s1.length();i++) {
            char cs1=s1.charAt(i);
            char cs2=s2.charAt(i);
            freqbool[cs1-'a']++;
            freqbool[cs2-'a']--;
        }
        for(int c : freqbool) {
            if(c!=0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st string: ");
        String str1=sc.next();
        System.out.println("Enter 2nd string: ");
        String str2=sc.next();
        boolean anagrams=singleHashMaps(str1.toLowerCase(),str2.toLowerCase());
        if(anagrams)
            System.out.println("Both Strings are Anagrams");
        else    
            System.out.println("Both Strings are not Anagrams");
    }
}
