import java.util.*;

public class Q7M1 {
    static boolean isIsogramM1(String s) {
        HashSet<Character> set = new HashSet<>();
        for(char c : s.toCharArray()) {
            if(set.contains(c)) 
                return false;
            set.add(c);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        if (isIsogramM1(str.toLowerCase()))
            System.out.println("The string is an Isogram");
        else
            System.out.println("The string is not an Isogram");
    }
}