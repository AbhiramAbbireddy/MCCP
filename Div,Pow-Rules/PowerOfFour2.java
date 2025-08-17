import java.util.Scanner;

public class PowerOfFour2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt(),original=n;
        boolean isPower = true;
        if(n<=0) {
            isPower = false;
        } else {
            while(n>1) {
                if(n%4!=0) {
                    isPower = false;
                    break;
                }
                n/=4;
            }
        }
        System.out.println(original + (isPower ? " is" : " is not") + " a power of 4");
        sc.close();
    }
}