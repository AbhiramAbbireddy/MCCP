
import java.util.Scanner;

public class Q1M2 {
    static void userFreq(String s) {
        int[] freq=new int[26];
        boolean[] freqbool=new boolean[26];
        for(char c: s.toCharArray())
            freq[c-'a']++;
        for(char c : s.toCharArray()) {
            if(!freqbool[c-'a']) {
                System.out.println(c+" "+freq[c-'a']);
                freqbool[c-'a']=true;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str=sc.next();
        userFreq(str.toLowerCase());
    }
}
