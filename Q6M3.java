import java.util.Scanner;

public class Q6M3 {
    static boolean findPangramM3(String s) {
        int[] freq=new int[26];
        s=s.replace(" ", "");
        for(char c: s.toCharArray())
            freq[c-'a']++;
        for(int n: freq) {
            if(n==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a word or a line of string : ");
        String s=sc.nextLine();
        boolean v=findPangramM3(s.trim().toLowerCase());
        if(v)
            System.out.println("The given (word or a line of string) is a Pangram");
        else  
            System.out.println("The given (word or a line of string) is not a Pangram");
    }
}
