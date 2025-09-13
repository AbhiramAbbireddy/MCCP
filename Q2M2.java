
import java.util.HashMap;
import java.util.Scanner;

public class Q2M2 {
    static boolean  doubleHashMaps(String s1,String s2) {
        if(s1.length()!=s2.length()) return false;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char c: s1.toCharArray())
            map1.put(c, map1.getOrDefault(c, 0)+1);
        for(char c: s2.toCharArray())
            map2.put(c, map2.getOrDefault(c, 0)+1);
        return map1.equals(map2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st string: ");
        String str1=sc.next();
        System.out.println("Enter 2nd string: ");
        String str2=sc.next();
        boolean anagrams=doubleHashMaps(str1.toLowerCase(),str2.toLowerCase());
        if(anagrams)
            System.out.println("Both Strings are Anagrams");
        else    
            System.out.println("Both Strings are not Anagrams");
    }
}
