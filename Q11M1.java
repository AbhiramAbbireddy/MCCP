import java.util.Scanner;

public class Q11M1 {
    static String reverseLetters(String s) {
        char[] arr=s.toCharArray();
        int i=0,j=arr.length-1;
        while(i<j) {
            if(!Character.isLetter(arr[i])) 
                i++;
            else if(!Character.isLetter(arr[j])) 
                j--;
            else {
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++; 
                j--;
            }
        }
        return String.valueOf(arr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.next();
        System.out.println("Reversed letters: " + reverseLetters(str));
    }
}
