import java.util.Arrays;
import java.util.Scanner;

public class Q5M2 {
    static int[] findPairsidx2(int[] arr, int n) {
        int i=0,j=n-1;
        while(i<j) {
            if(arr[i]+arr[j]==0)
                return new int[]{i,j};
            else if(arr[i]+arr[j]<0)
                i++;
            else
                j--;
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++) 
            arr[i]=sc.nextInt();
        int[] sol = findPairsidx2(arr,n);
        if(sol[0]==-1)
            System.out.println("No pair exists");
        else
            System.out.println("Pair indices: " + Arrays.toString(sol));
    }
}
