import java.util.*;

public class Q1M2 {
    static boolean findTargetM2(int[] arr,int n) {
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        while(i<j) {
            if(arr[i]+arr[j]==0)
                return true;
            else if(arr[i]+arr[j]<0)
                i++;
            else
                j--;
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
        if(findTargetM2(arr,n))
            System.out.println(" The pair exists with sum equal to zero");
        else    
            System.out.println(" There is no  pair exists with sum equal to zero");
    }
}
