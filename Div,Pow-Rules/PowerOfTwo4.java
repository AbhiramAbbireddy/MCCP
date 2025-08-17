import java.util.Scanner;
public class PowerOfTwo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        String binary = Integer.toBinaryString(n);
        boolean isPower = binary.matches("10*");
        System.out.println(n + (isPower ? " is" : " is not") + " a power of 2");
        sc.close();
    }
}