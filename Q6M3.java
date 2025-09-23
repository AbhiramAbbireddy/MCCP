import java.util.Scanner;

public class Q6M3 {
    static boolean findPairSortM3(int[] arr,int n,int t){
        for(int i=0;i<n;i++){
            int rem=t-arr[i];
            int l=i+1,h=n-1;
            while(l<=h){
                int mid=(l+h)/2;
                if(arr[mid]==rem) 
                    return true;
                else if(arr[mid]<rem) 
                    l=mid+1;
                else 
                    h=mid-1;
            }
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
        boolean ans = findPairSortM3(arr,n,t);
        System.out.println(ans ? "Pair exists" : "No pair exists");
    }
}
