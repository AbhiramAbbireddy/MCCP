import java.util.*;

public class Q3M3 {
    static int findRepeatedQ3M3(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int unqsum=0,total=0;
        for (int num : arr) {
            if (set.add(num))
                unqsum += num;
            total += num;
        }
        return 2*unqsum-total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: (odd)");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int rep = findRepeatedQ3M3(arr);
        if (rep == -1)
            System.err.println("There is no repeated element in the array");
        else
            System.out.println("The repeated element in the array is " + rep);
    }
}
