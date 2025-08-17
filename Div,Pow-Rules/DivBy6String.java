import java.util.Scanner;
public class DivBy6String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a large number: ");
        String n = sc.nextLine().trim();
        char ld = n.charAt(n.length()-1);
        boolean divBy2 = ((ld-'0')&1) == 0;
        int sum = 0;
        for (char c : n.toCharArray()) sum+= c-'0';
        boolean divBy3 = sum%3 == 0;
        System.out.println(n +((divBy2 && divBy3) ? " is" : " is not") + " divisible by 6");
        sc.close();
    }
}