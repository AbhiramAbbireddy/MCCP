
import java.util.Scanner;

public class Q1M1 {
    static boolean findTargetM1(int[] arr,int n) {
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
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        if(findTargetM1(arr,n))
            System.out.println(" The pair exists with sum equal to zero");
        else    
            System.out.println(" There is no  pair exists with sum equal to zero");
    }
}