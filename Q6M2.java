import java.util.HashMap;
import java.util.Scanner;

class Q6M2 {
    static boolean findPangramM2(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        s=s.replace(" ", "");
        for(char c: s.toCharArray())
            map.put(c, map.getOrDefault(c, 0)+1);
        return map.size() == 26;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a word or a line of string : ");
        String s=sc.nextLine();
        boolean v=findPangramM2(s.trim().toLowerCase());
        if(v)
            System.out.println("The given (word or a line of string) is a Pangram");
        else  
            System.out.println("The given (word or a line of string) is not a Pangram");
    }
}