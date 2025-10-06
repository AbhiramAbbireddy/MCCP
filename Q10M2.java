import java.util.*;

public class Q10M2 {
    static int[] sortSquares(int[] arr) {
        int n=arr.length;
        int[] res=new int[n];
        int i=0,j=n-1,k=n-1;
        while(i<=j) {
            if(arr[j]*arr[j]>arr[i]*arr[i]) 
                res[k--]=arr[j]*arr[j--];
            else 
                res[k--]=arr[i]*arr[i++];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++) 
            arr[i]=sc.nextInt();
        int[] res=sortSquares(arr);
        System.out.println("Sorted squares: " + Arrays.toString(res));
    }
}
