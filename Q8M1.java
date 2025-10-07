import java.util.Scanner;

public class Q8M1 {
    static void sortBallsCounting(char[] a,int n) {
        int wc=0,bc=0,rc=0;
        for(int i=0;i<n;i++) {
            if(a[i]=='w') 
                wc++;
            else if(a[i]=='b') 
                bc++;
            else rc++;
        }
        int k=0;
        for(int i=0;i<wc;i++) a[k++]='w';
        for(int i=0;i<bc;i++) a[k++]='b';
        for(int i=0;i<rc;i++) a[k++]='r';
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        char[] arr=new char[n];
        System.out.println("Enter the elements (w,b,r) in the array: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.next().charAt(0);

        sortBallsCounting(arr,n);

        System.out.println("Sorted array: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
