import java.util.Arrays;
import java.util.Scanner;

public class Q8M1 {
    static int[] findPairSortM1(int[] arr,int n,int t){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==t) 
                    return new int[]{i,j};
            }
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
        int[] sol = findPairSortM1(arr,n,t);
        if(sol[0]==-1) System.out.println("No pair exists");
        else System.out.println("Pair indices: " + Arrays.toString(sol));
    }
}
