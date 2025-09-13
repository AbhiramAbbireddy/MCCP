import java.util.*;

public class Q5M2 {
    static boolean usingHashSetQ5M2(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr) {
            if(!set.add(num))
                set.remove(num);
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
            arr[i]=sc.nextInt();
        if (usingHashSetQ5M2(arr))
            System.out.println("Valid: All elements occur even number of times");
        else
            System.out.println("Not Valid");
    }
}
