import java.util.Scanner;

public class Q7M1 {
    static void sort012Counting(int[] a,int n) {
        int[] freq=new int[3];
        for(int i=0;i<n;i++)
            freq[a[i]]++;
        int k=0;
        for(int i=0;i<3;i++) {
            for(int j=0;j<freq[i];j++)
                a[k++]=i;
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
        sort012Counting(arr,n);
        System.out.println("Sorted array: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
