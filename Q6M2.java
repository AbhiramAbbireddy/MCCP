import java.util.*;

public class Q6M2 {
    static int countPairsWithDuplicatesM2(int[] a,int n,int t) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++) {
            int x=a[i];
            int y=t-x;
            if(map.containsKey(y) && map.get(y)>0) {
                int c=map.get(y);
                count+=c;
            }
            map.put(x,map.getOrDefault(x,0)+1);
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
        int count=countPairsWithDuplicatesM2(arr,n,t);
        System.out.println("Count of pairs equal to target: " + count);
    }
}