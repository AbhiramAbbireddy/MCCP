import java.util.Scanner;

public class Q4M1 {
    static boolean findPairBFM1(int[] arr, int n) {
        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                if(arr[i]+arr[j]==0)
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
        for(int i=0;i<n;i++) 
            arr[i]=sc.nextInt();
        boolean ans = findPairBFM1(arr,n);
        System.out.println(ans ? "Pair exists" : "No pair exists");
    }
}
