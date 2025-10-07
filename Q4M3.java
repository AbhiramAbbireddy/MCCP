import java.util.*;

public class Q4M3 {
    static int countPairsSortedM3(int[] a, int n, int t) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++) {
            int x=a[i];
            int y=t-x;
            if(map.containsKey(y)) {
                count++;
            } else {
                map.put(x, 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the sorted array: ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter a target element: ");
        int t = sc.nextInt();
        int count = countPairsSortedM3(arr, n, t);
        System.out.println("Count of pairs equal to target: " + count);
    }
}
