import java.util.Arrays;
import java.util.Scanner;

public class Q8M2 {
    static int[] findPairSortM2(int[] arr,int n,int t){
        int i=0,j=n-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==t) 
                return new int[]{i,j};
            else if(sum<t) 
                i++;
            else 
                j--;
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
        int[] sol = findPairSortM2(arr,n,t);
        if(sol[0]==-1) 
            System.out.println("No pair exists");
        else 
            System.out.println("Pair indices: " + Arrays.toString(sol));
    }
}
