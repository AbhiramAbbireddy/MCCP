import java.util.Scanner;
public class DivBy4String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a large number: ");
        String n = sc.nextLine().trim();
        int l = n.length();
        int lasttwo = (l>=2)? Integer.parseInt(n.substring(l-2)):Integer.parseInt(n);
        System.out.println(n+((lasttwo % 4 == 0) ? " is" : " is not") + " divisible by 4");
        sc.close();
    }
}
