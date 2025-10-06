import java.util.Arrays;
import java.util.Scanner;

public class Q7M1 {
    static int[] mergeSort(int[] a, int m, int[] b, int n) {
        int[] res=new int[n+m];
        for(int i=0;i<n;i++) 
            res[i]=a[i];
        for(int j=0;j<m;j++) 
            res[n+j]=b[j];
        Arrays.sort(res);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the first array: ");
        int m=sc.nextInt();
        int[] arr1=new int[m];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<m;i++)
            arr1[i]=sc.nextInt();
        System.out.println("Enter the size of the second array: ");
        int n=sc.nextInt();
        int[] arr2=new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<n;i++)
            arr2[i]=sc.nextInt();
        int[] merged = mergeSort(arr1,m,arr2,n);
        System.out.println("Merged (Method 1): " + Arrays.toString(merged));
    }
}
