import java.util.*;

public class Q2 {
    static String reverse(String s) {
        char[] c=s.toCharArray();
        int j=s.length()-1;
        for(int i=0;i<s.length()/2;i++) {
            if(c[i]!=c[j]) {
                char temp=c[i];
                c[i]=c[j];
                c[j]=temp;
            }
            j--;
        }
        return String.valueOf(c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();
        String rev = reverse(s);
        System.out.println(rev);
    }
}