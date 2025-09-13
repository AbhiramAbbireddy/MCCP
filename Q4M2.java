import java.util.*;

public class Q4M2 {
    static boolean usingHashSetQ4M2(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : arr) {
            if(!set.add(n)) 
                set.remove(n);
        }
        return set.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size (even): ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++) 
            arr[i] = sc.nextInt();
        if (usingHashSetQ4M2(arr))
            System.out.println("Valid: Each element occurs exactly twice");
        else
            System.out.println("Not Valid");
    }
}