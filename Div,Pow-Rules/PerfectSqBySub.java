import java.util.Scanner;
public class PerfectSqBySub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt(),odd=1,temp=n;
        while(temp>0) {
            temp-=odd;  
            odd+=2;     
        }
        if (temp == 0)
            System.out.println(n + " is a perfect square");
        else
            System.out.println(n + " is not a perfect square");
        sc.close();
    }
}
