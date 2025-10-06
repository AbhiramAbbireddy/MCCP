import java.util.*;

public class Q7M2 {
    static int[] mergeTwoPointers(int[] a, int m, int[] b, int n) {
        int[] res=new int[m + n];
        int i=0,j=0,k=0;
        while(i<m && j<n) {
            if(a[i]<=b[j]) 
                res[k++]=a[i++];
            else 
                res[k++]=b[j++];
        }
        while(i<m) 
            res[k++]=a[i++];
        while(j<n) 
            res[k++]=b[j++];
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array: ");
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i < m; i++)
            arr1[i] = sc.nextInt();
        System.out.println("Enter the size of the second array: ");
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i < n; i++)
            arr2[i] = sc.nextInt();
        int[] merged=mergeTwoPointers(arr1, m, arr2, n);
        System.out.println("Merged (Method 2): " + Arrays.toString(merged));
    }
}
