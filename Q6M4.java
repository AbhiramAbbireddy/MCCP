import java.util.Scanner;

public class Q6M4 {
    static boolean findPangramM4(String s) {
        boolean[] visited =new boolean[26];
        s=s.replace(" ", "");
        for(char c: s.toCharArray())
            visited[c-'a']=true;
        for(boolean v: visited) {
            if(!v)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a word or a line of string : ");
        String s=sc.nextLine();
        boolean v=findPangramM4(s.trim().toLowerCase());
        if(v)
            System.out.println("The given (word or a line of string) is a Pangram");
        else  
            System.out.println("The given (word or a line of string) is not a Pangram");
    }
}
