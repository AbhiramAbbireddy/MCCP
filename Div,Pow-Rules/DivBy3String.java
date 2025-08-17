import java.util.Scanner;
public class DivBy3String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a large number: ");
        String n=sc.nextLine().trim();
        int sum=0;
        for (char c:n.toCharArray()) {
            sum +=c-'0';
        }
        System.out.println(n+((sum%3==0) ?" is" : " is not") + " divisible by 3");
        sc.close();
    }
}