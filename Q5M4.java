import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Q5M4 {
    static int[] findPairsidx4(int[] arr, int n, int t) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++) {
            int rem=t-arr[i];
            if(map.containsKey(rem))
                return new int[]{map.get(rem),i};
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.print("Enter target sum: ");
        int t=sc.nextInt();
        int[] sol=findPairsidx4(arr,n,t);
        if(sol[0]==-1)
            System.out.println("No pair exists");
        else
            System.out.println("Pair indices: " + Arrays.toString(sol));
    }
}
