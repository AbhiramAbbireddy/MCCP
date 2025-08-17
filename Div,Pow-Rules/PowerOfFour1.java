import java.util.Scanner;
public class PowerOfFour1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int d = 1;
        boolean isPower = false;
        while(true) {
            if (d == n) {
                isPower = true;
                break;
            }
            if(d>n) {
                break;
            }
            d*=4;
        }
        System.out.println(n + (isPower ? " is" : " is not") + " a power of 4");
        sc.close();
    }
}