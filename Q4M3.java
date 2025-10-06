import java.util.HashSet;
import java.util.Scanner;

public class Q4M3 {
    static boolean findPairSortM4(int[] arr,int n){
        HashSet<Integer> set=new HashSet<>();
        for(int num: arr){
            if(num==0) {
                if(set.contains(0))
                    return true;
            }
            if(set.contains(-num)) 
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
        boolean ans = findPairSortM4(arr,n);
        System.out.println(ans ? "Pair exists" : "No pair exists");
    }
}
