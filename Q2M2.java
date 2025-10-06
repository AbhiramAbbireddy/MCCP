import java.util.*;

public class Q2M2 {
    static int[] findParisM2(int[] arr) {
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        while(i<j) {
            if(arr[i]+arr[j]==0)
                return new int[]{arr[i],arr[j]};
            else if(arr[i]+arr[j]<0)
                i++;
            else
                j--;
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
        int[] sol = findParisM2(arr);
        if(sol[0]==-1)
            System.out.println("No pair exists with sum equal to zero");
        else
            System.out.println("Pair found: (" + sol[0] + ", " + sol[1] + ")");
    }
}
