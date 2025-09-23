import java.util.Scanner;

public class Q4M1 {
    static int[] findParisM1(int[] arr,int n, int t) {
        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                if(arr[i]+arr[j]==t)
                    return new int[]{arr[i],arr[j]};
            }
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the target sum: ");
        int t=sc.nextInt();
        int[] sol = findParisM1(arr,n,t);
        if(sol[0]==-1)
            System.out.println("No pair exists with sum equal to target");
        else
            System.out.println("Pair found: (" + sol[0] + ", " + sol[1] + ")");
    }
}
