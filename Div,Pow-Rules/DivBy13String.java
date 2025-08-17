import java.util.Scanner;
public class DivBy13String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String n = sc.nextLine().trim();
        while(n.length()>2) {
            int ld = n.charAt(n.length()-1)-'0';
            int rmn = Integer.parseInt(n.substring(0, n.length()-1));
            int sum = rmn+ld*4;
            n = String.valueOf(sum);
        }
        int finaln = Integer.parseInt(n);
        if (finaln%13 == 0)
            System.out.println("Divisible by 13");
        else
            System.out.println("Not divisible by 13");

        sc.close();
    }
}