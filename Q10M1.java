import java.util.*;

public class Q10M1 {
    static int[] sortSquares(int[] arr) {
        for(int i=0;i<arr.length;i++) 
            arr[i]=arr[i]*arr[i];
        Arrays.sort(arr);
        return arr;
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
