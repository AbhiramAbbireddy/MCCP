import java.util.HashSet;
import java.util.Scanner;

public class Q3M4 {
    static boolean findTargetM4(int[] arr,int n, int t) {
        HashSet<Integer> set=new HashSet<>();
        for(int num: arr) {
            if(set.contains(t-num))
                return true;
            else    
                set.add(num);
        }
        return false;
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
        boolean find = findTargetM4(arr,n,t);
        if(find)
            System.out.println(" The pair exists with sum equal to target");
        else    
            System.out.println(" There is no  pair exists with sum equal to target");
    }
}
