import java.util.*;

public class Q3M2 {
    static int findRepeatedQ3M2(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr)
            map.put(num, map.getOrDefault(num, 0)+1);
        for (int key : map.keySet()) {
            if (map.get(key) == 1)
                return key;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: (odd)");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int rep = findRepeatedQ3M2(arr);
        if (rep == -1)
            System.err.println("There is no repeated element in the array");
        else
            System.out.println("The repeated element in the array is " + rep);
    }
}