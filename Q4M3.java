import java.util.Arrays;
import java.util.Scanner;

public class Q4M3 {
    static boolean binarySearch(int[] arr,int n,int x) {
        int l=0,h=n-1;
        while(l<=h) {
            int mid=(l+h)/2;
            if(arr[mid]==x)
                return true;
            else if(arr[mid]<x)
                l=mid+1;
            else
                h=mid-1;
        }
        return false;
    }
    static int[] findParisM3(int[] arr,int n, int t) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            if(binarySearch(arr,n,t-arr[i]))
                return new int[]{arr[i],t-arr[i]};
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the target sum: ");
        int t=sc.nextInt();
        int[] sol = findParisM3(arr,n,t);
        if(sol[0]==-1)
            System.out.println("No pair exists with sum equal to target");
        else
            System.out.println("Pair found: (" + sol[0] + ", " + sol[1] + ")");
    }
}
