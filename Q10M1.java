import java.util.Scanner;

public class Q10M1 {
    static String rcdTP(String s) {
        StringBuilder str=new StringBuilder();
        int n=s.length();
        if(n==0) 
            return "";
        str.append(s.charAt(0));
        for(int i=1;i<n;i++) {
            if(s.charAt(i)!=s.charAt(i-1))
                str.append(s.charAt(i));
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.next();
        String result=rcdTP(s);
        System.out.println("String after removing consecutive duplicates: "+result);
    }
}
