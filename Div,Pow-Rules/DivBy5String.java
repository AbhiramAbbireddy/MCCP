import java.util.Scanner;
public class DivBy5String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a large number: ");
        String n = sc.nextLine().trim();
        char ld = n.charAt(n.length()-1);
        boolean divisible = (ld == '0' || ld == '5');
        System.out.println(n + (divisible ? " is" : " is not") + " divisible by 5");
        sc.close();
    }
}