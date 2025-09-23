import java.util.HashSet;
import java.util.Scanner;

public class Q4M4 {
    static int[] findParisM4(int[] arr,int n, int t) {
        HashSet<Integer> set=new HashSet<>();
        for(int num: arr) {
            if(set.contains(t-num))
                return new int[]{num,t-num};
            else    
                set.add(num);
        }
        return new int[]{-1,-1};
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
        int[] sol = findParisM4(arr,n,t);
        if(sol[0]==-1)
            System.out.println("No pair exists with sum equal to target");
        else
            System.out.println("Pair found: (" + sol[0] + ", " + sol[1] + ")");
    }
}
