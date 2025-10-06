import java.util.Scanner;

public class Q4M2 {
    static boolean findPairSortM2(int[] arr,int n){
        int i=0,j=n-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==0) 
                return true;
            else if(sum<0) 
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
        for(int i=0;i<n;i++) 
            arr[i]=sc.nextInt();
        boolean ans = findPairSortM2(arr,n);
        System.out.println(ans ? "Pair exists" : "No pair exists");
    }
}