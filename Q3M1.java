
import java.util.Scanner;

public class Q3M1 {
    static boolean findTargetM1(int[] arr,int n, int t) {
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
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the target sum: ");
        int t=sc.nextInt();
        boolean find = findTargetM1(arr,n,t);
        if(find)
            System.out.println(" The pair exists with sum equal to target");
        else    
            System.out.println(" There is no  pair exists with sum equal to target");
    }
}