import java.util.*;

public class Q6M1 {
    static int countPairsWithDuplicatesM1(int[] a,int n,int t) {
        int count=0;
        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                if(a[i]+a[j]==t) 
                    count++;
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
        int count=countPairsWithDuplicatesM1(arr,n,t);
        System.out.println("Count of pairs equal to target: " + count);
    }
}
