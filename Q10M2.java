import java.util.*;

public class Q10M2 {
    static String rcdStack(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(st.isEmpty() || st.peek()!=ch) {
                st.push(ch);
                str.append(ch);
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.next();
        String result=rcdStack(s);
        System.out.println("String after removing consecutive duplicates: "+result);
    }
}
