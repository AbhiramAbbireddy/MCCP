import java.util.Scanner;

public class Q2M6 {
    static boolean usingXOR(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int res=0;
        for(char c : s1.toCharArray()) 
            res=res^(int) c;
        for(char c : s2.toCharArray()) 
            res=res^(int) c;
        return res==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string: ");
        String str1 = sc.next();
        System.out.println("Enter 2nd string: ");
        String str2 = sc.next();
        char a = 'A';
        System.out.println((int) a);
        boolean anagrams = usingXOR(str1.toLowerCase(), str2.toLowerCase());
        if (anagrams)
            System.out.println("Both Strings are Anagrams");
        else
            System.out.println("Both Strings are not Anagrams");
    }
}
