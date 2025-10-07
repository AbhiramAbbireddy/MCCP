import java.util.Scanner;

public class Q9M2 {
    static void segregateEvenOddTwoPointer(int[] a,int n) {
        int i=0,j=n-1;
        while(i<j) {
            while(i<j && (a[i]&1)==0) 
                i++;
            while(i<j && (a[j]&1)==1) 
                j--;
            if(i<j) {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        segregateEvenOddTwoPointer(arr,n);
        System.out.println("Modified array: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}