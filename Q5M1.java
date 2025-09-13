import java.util.*;

public class Q5M1 {
    static boolean usingHashMapQ5M1(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr) 
            map.put(num, map.getOrDefault(num, 0) + 1);
        for (int freq : map.values()) {
            if(freq%2!=0) 
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
            arr[i]=sc.nextInt();
        if (usingHashMapQ5M1(arr))
            System.out.println("Valid: All elements occur even number of times");
        else
            System.out.println("Not Valid");
    }
}
