import java.util.Scanner;

public class Q7M2 {
    static boolean isIsogramM2(String s) {
        boolean[] freq = new boolean[26];
        for(char c : s.toCharArray()) {
            if(c>='a' && c<='z') {
                if(freq[c-'a'])
                    return false;
                freq[c-'a']=true;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        if (isIsogramM2(str.toLowerCase()))
            System.out.println("The string is an Isogram");
        else
            System.out.println("The string is not an Isogram");
    }
}
