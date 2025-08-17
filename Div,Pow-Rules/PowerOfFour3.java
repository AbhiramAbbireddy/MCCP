import java.util.Scanner;
public class PowerOfFour3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        boolean isPower = false;
        int m = 0;
        while(Math.pow(4, m) <= n) {
            if(Math.pow(4, m) == n) {
                isPower = true;
                break;
            }
            m++;
        }
        System.out.println(n + (isPower ? " is" : " is not") + " a power of 4");
        sc.close();
    }
}