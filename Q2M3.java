import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q2M3 {
    static boolean  singleHashMaps(String s1,String s2) {
        if(s1.length()!=s2.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s1.length();i++) {
            char cs1=s1.charAt(i);
            char cs2=s2.charAt(i);
            map.put(cs1, map.getOrDefault(cs1, 0)+1);
            map.put(cs2, map.getOrDefault(cs2, 0)-1);
        }
        for(Map.Entry<Character,Integer> e : map.entrySet()) {
            if(e.getValue()!=0)
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
