import java.util.*;

public class Q8M2 {
    static void twoPointerMerge(int[] a, int m, int[] b, int n) {
        int[] res=new int[m+n];
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
        for(i=0;i<m;i++) 
            a[i]=res[i];
        for(i=0;i<n;i++) 
            b[i]=res[m+i];
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
        twoPointerMerge(arr1,m,arr2,n);
        System.out.println("First array: " + Arrays.toString(arr1));
        System.out.println("Second array: " + Arrays.toString(arr2));
    }
}
