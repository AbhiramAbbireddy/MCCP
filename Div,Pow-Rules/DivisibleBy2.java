import java.util.Scanner;
public class DivisibleBy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a large number: ");
        String n = sc.nextLine().trim();
        int last = n.charAt(n.length()-1)-'0';
        boolean divisible = (last&1) == 0;
        System.out.println(n + (divisible ? " is" : " is not") + " divisible by 2");
        sc.close();
    }
}
