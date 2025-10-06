import java.util.Scanner;

public class Q6M2 {
    static int[] findPairSortM2(int[] arr,int n){
        int i=0,j=n-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==0) 
                return new int[]{arr[i],arr[j]};
            else if(sum<0) 
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
        for(int i=0;i<n;i++) 
            arr[i]=sc.nextInt();
        int[] sol = findPairSortM2(arr,n);
        if(sol[0]==-1) 
            System.out.println("No pair exists");
        else 
            System.out.println("Pair found: (" + sol[0] + ", " + sol[1] + ")");
    }
}
