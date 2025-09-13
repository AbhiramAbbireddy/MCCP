import java.util.*;

public class Q4 {
    static ArrayList<Integer> evenRepeated(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int n : arr)
            map.put(n, map.getOrDefault(n, 0) + 1);
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() != 2)
                al.add(e.getKey());
        }
        return al;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: (even)");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        ArrayList<Integer> al = evenRepeated(arr);
        if (al.isEmpty())
            System.err.println("Every element in the array appears twice");
        else {
            System.out.println("These are the elements in the array that don't appear twice: ");
            for (int x : al)
                System.out.print(x + " ");
        }
    }
}
