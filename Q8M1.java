import java.util.*;

public class Q8M1 {
    static void mergeSort(int[] a, int m, int[] b, int n) {
        int[] res=new int[m+n];
        for(int i=0;i<m;i++) 
            res[i]=a[i];
        for(int j=0;j<n;j++) 
            res[m+j]=b[j];
        Arrays.sort(res);
        for(int i=0;i<m;i++) 
            a[i]=res[i];
        for(int j=0;j<n;j++) 
            b[j]=res[m+j];
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
        mergeSort(arr1,m,arr2,n);
        System.out.println("First array: " + Arrays.toString(arr1));
        System.out.println("Second array: " + Arrays.toString(arr2));
    }
}
