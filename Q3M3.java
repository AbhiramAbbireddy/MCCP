import java.util.Arrays;
import java.util.Scanner;

public class Q3M3 {
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
    static boolean findTargetM3(int[] arr,int n, int t) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            if(binarySearch(arr,n,t-arr[i]))
                return true;
        }
        return false;
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
        boolean find = findTargetM3(arr,n,t);
        if(find)
            System.out.println(" The pair exists with sum equal to target");
        else    
            System.out.println(" There is no  pair exists with sum equal to target");
    }
}