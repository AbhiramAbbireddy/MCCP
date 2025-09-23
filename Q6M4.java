import java.util.HashSet;
import java.util.Scanner;

public class Q6M4 {
    static boolean findPairSortM4(int[] arr,int n,int t){
        HashSet<Integer> set=new HashSet<>();
        for(int num: arr){
            if(set.contains(t-num)) 
                return true;
            set.add(num);
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
        boolean ans = findPairSortM4(arr,n,t);
        System.out.println(ans ? "Pair exists" : "No pair exists");
    }
}
