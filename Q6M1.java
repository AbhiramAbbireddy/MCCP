import java.util.*;
class Q6M1 {
    static boolean findPangramM1(String s) {
        HashSet<Character> set = new HashSet<>();
        s=s.replace(" ", "");
        for(char c: s.toCharArray())
            set.add(c);
        return set.size() == 26;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a word or a line of string : ");
        String s=sc.nextLine();
        boolean v=findPangramM1(s.trim().toLowerCase());
        if(v)
            System.out.println("The given (word or a line of string) is a Pangram");
        else  
            System.out.println("The given (word or a line of string) is not a Pangram");
    }
}