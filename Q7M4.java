import java.util.HashSet;
import java.util.Scanner;

public class Q7M4 {
    static int[] findPairSortM4(int[] arr,int n,int t){
        HashSet<Integer> set = new HashSet<>();
        for(int num: arr){
            int rem=t-num;
            if(set.contains(rem)) 
                return new int[]{rem,num};
            set.add(num);
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
        int[] sol = findPairSortM4(arr,n,t);
        if(sol[0]==-1) 
            System.out.println("No pair exists");
        else 
            System.out.println("Pair found: (" + sol[0] + ", " + sol[1] + ")");
    }
}
