import java.util.Scanner;
public class PowerOfThree2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        boolean isPower = true;
        if(n<=0) {
            isPower = false;
        } else {
            while (n>1) {
                if (n%3!=0) {
                    isPower = false;
                    break;
                }
                n/=3;
            }
        }
        System.out.println(n + (isPower ? " is" : " is not") + " a power of 3");
        sc.close();
    }
}
