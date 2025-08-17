import java.util.Scanner;
public class PowerOfTwo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        boolean isPower = true;
        if (n<=0) {
            isPower = false;
        } else {
            while (n>1) {
                if (n%2!=0) {
                    isPower = false;
                    break;
                }
                n/=2;
            }
        }
        System.out.println((isPower ? "Yes, it is" : "No, it is not") + " a power of 2");
        sc.close();
    }
}
