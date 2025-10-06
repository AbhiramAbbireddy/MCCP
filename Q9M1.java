import java.util.Scanner;

public class Q9M1 {
    static String mergeStrings(String a,String b) {
        StringBuilder str=new StringBuilder();
        int i=0,j=0;
        while(i<a.length() || j<b.length()) {
            if(i<a.length()) 
                str.append(a.charAt(i++));
            if(j<b.length()) 
                str.append(b.charAt(j++));
        }
        return str.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1=sc.next();
        System.out.println("Enter second string: ");
        String s2=sc.next();
        System.out.println("Merged string: " + mergeStrings(s1,s2));
    }
}