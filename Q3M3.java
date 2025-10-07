import java.util.*;

public class Q3M3 {
    static int countPairsUnsortedM3(int[] a, int n, int t) {
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
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<n;i++) 
            arr[i]=sc.nextInt();
        System.out.println("Enter a target element: ");
        int t=sc.nextInt();
        int count=countPairsUnsortedM3(arr,n,t);
        System.out.println("Count of pairs equal to target: " + count);
    }
}
