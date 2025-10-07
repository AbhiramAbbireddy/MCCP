import java.util.Scanner;

public class Q8M2 {
    static void sortBallsDNF(char[] a,int n) {
        int l=0,m=0,h=n-1;
        while(m<=h) {
            if(a[m]=='w') {
                char temp=a[l];
                a[l]=a[m];
                a[m]=temp;
                l++;
                m++;
            } else if(a[m]=='r') {
                char temp=a[m];
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
        char[] arr=new char[n];
        System.out.println("Enter the elements (w,b,r) in the array: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.next().charAt(0);
        sortBallsDNF(arr,n);
        System.out.println("Sorted array: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
