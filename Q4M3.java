import java.util.*;

public class Q4M3 {
    static boolean usingSortingQ4M3(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i+=2) {
            if(arr[i]!=arr[i+1]) 
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size (even): ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++) 
            arr[i] = sc.nextInt();
        if (usingSortingQ4M3(arr))
            System.out.println("Valid: Each element occurs exactly twice");
        else
            System.out.println("Not Valid");
    }
}
