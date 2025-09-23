import java.util.Arrays;
import java.util.Scanner;

public class Q8M3 {
    static int binarySearch(int[] arr,int l,int h,int x){
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==x) 
                return mid;
            else if(arr[mid]<x) 
                l=mid+1;
            else 
                h=mid-1;
        }
        return -1;
    }
    static int[] findPairSortM3(int[] arr,int n,int t){
        for(int i=0;i<n;i++){
            int rem=t-arr[i];
            int idx=binarySearch(arr,i+1,n-1,rem);
            if(idx!=-1) 
                return new int[]{i,idx};
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter sorted elements:");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.print("Enter target sum: ");
        int t=sc.nextInt();
        int[] sol = findPairSortM3(arr,n,t);
        if(sol[0]==-1) 
            System.out.println("No pair exists");
        else 
            System.out.println("Pair indices: " + Arrays.toString(sol));
    }
}
