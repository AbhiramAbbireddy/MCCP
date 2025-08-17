import java.util.Scanner;
public class PowerOfTwo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int m = 0;
        boolean isPower = false;
        while (Math.pow(2, m)<=n && n%2 == 0) {
            if (Math.pow(2, m) == n) {
                isPower = true;
                break;
            }
            m++;
        }
        System.out.println(n + (isPower ? " is" : " is not") + " a power of 2");
        sc.close();
    }
}
