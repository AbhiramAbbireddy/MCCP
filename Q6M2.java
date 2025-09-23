import java.util.Scanner;

public class Q6M2 {
    static boolean findPairSortM2(int[] arr,int n,int t){
        int i=0,j=n-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==t) 
                return true;
            else if(sum<t) 
                i++;
            else 
                j--;
        }
        return false;
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
        boolean ans = findPairSortM2(arr,n,t);
        System.out.println(ans ? "Pair exists" : "No pair exists");
    }
}