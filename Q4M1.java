import java.util.*;

public class Q4M1 {
    static boolean usingHashMapQ4M1(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : arr) 
            map.put(n, map.getOrDefault(n, 0) + 1);
        for(int freq : map.values()) {
            if(freq!=2) 
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
        if (usingHashMapQ4M1(arr))
            System.out.println("Valid: Each element occurs exactly twice");
        else
            System.out.println("Not Valid");
    }
}