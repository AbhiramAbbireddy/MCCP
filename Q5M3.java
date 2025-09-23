import java.util.Arrays;
import java.util.Scanner;

public class Q5M3 {
    static int binarySearch(int[] arr, int l, int h, int x) {
        while(l<=h) {
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
    static int[] findPairsidx3(int[] arr, int n, int t) {
        int[] temp = Arrays.copyOf(arr, n);
        Arrays.sort(temp);
        for(int i=0;i<n;i++) {
            int rem=t-temp[i];
            int idx = binarySearch(temp,i+1,n,rem);
            if(idx>=0) {
                int index1=-1, index2=-1;
                for(int k=0;k<n;k++) {
                    if(arr[k]==temp[i] && index1==-1) index1=k;
                    else if(arr[k]==temp[idx]) index2=k;
                }
                return new int[]{index1,index2};
            }
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
        int[] sol=findPairsidx3(arr,n,t);
        if(sol[0]==-1)
            System.out.println("No pair exists");
        else
            System.out.println("Pair indices: " + Arrays.toString(sol));
    }
}
