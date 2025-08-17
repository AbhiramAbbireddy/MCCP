import java.util.Scanner;
public class DivBy11String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a large number: ");
        String n = sc.nextLine().trim();
        int sumodd = 0, sumeven = 0;
        for(int i=0;i<n.length();i++) {
            int d=n.charAt(i)-'0';
            if (i%2 == 0) sumodd += d;
            else sumeven += d;
        }
        boolean divisible = Math.abs(sumodd - sumeven) % 11 == 0;
        System.out.println(n + (divisible ? " is" : " is not") + " divisible by 11");
        sc.close();
    }
}
