import java.util.Scanner;

class Q1 {
    static boolean isPalindrome(String s) {
        char[] c=s.toCharArray();
        int j=s.length()-1;
        for(int i=0;i<s.length()/2;i++) {
            if(c[i]!=c[j]) {
                return false;
            }
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.next();
        boolean pal=isPalindrome(s);
        if(pal)
            System.out.println("The given string is a palindrome");
        else   
            System.out.println("The given string is not a palindrome");
    }
}