import java.util.Scanner;

public class Q7M2 {
    static void sort012DNF(int[] a,int n) {
        int l=0,m=0,h=n-1;
        while(m<=h) {
            if(a[m]==0) {
                int temp=a[l];
                a[l]=a[m];
                a[m]=temp;
                l++;
                m++;
            } else if(a[m]==2) {
                int temp=a[m];
                a[m]=a[h];
                a[h]=temp;
                h--;
            } else
                m++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements (0,1,2) in the array: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        sort012DNF(arr,n);
        System.out.println("Sorted array: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
