import java.util.Scanner;
public class PowerOfTwo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        boolean isPower = (n>0) && ((n&(n-1)) == 0);
        System.out.println(n + (isPower ? " is" : " is not") + " a power of 2");
        sc.close();
    }
}