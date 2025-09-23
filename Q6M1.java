import java.util.Scanner;

public class Q6M1 {
    static boolean findPairBFM1(int[] arr, int n, int t) {
        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                if(arr[i]+arr[j]==t)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter sorted elements:");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.print("Enter target sum: ");
        int t=sc.nextInt();
        boolean ans = findPairBFM1(arr,n,t);
        System.out.println(ans ? "Pair exists" : "No pair exists");
    }
}
