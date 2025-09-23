import java.util.Arrays;
import java.util.Scanner;

public class Q5M2 {
    static int[] findPairsidx2(int[] arr, int n, int t) {
        int[] temp = Arrays.copyOf(arr, n);
        Arrays.sort(temp);
        int i=0,j=n-1;
        while(i<j) {
            int sum=temp[i]+temp[j];
            if(sum==t) {
                int idx1=-1,idx2=-1;
                for(int k=0;k<n;k++) {
                    if(arr[k]==temp[i] && idx1==-1) 
                        idx1=k;
                    else if(arr[k]==temp[j]) 
                        idx2=k;
                }
                return new int[]{idx1,idx2};
            }
            else if(sum<t) 
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
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.print("Enter target sum: ");
        int t=sc.nextInt();
        int[] sol = findPairsidx2(arr, n, t);
        if(sol[0]==-1)
            System.out.println("No pair exists");
        else
            System.out.println("Pair indices: " + Arrays.toString(sol));
    }
}
