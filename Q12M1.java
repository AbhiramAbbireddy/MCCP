import java.util.*;

public class Q12M1 {
    static void moveZeros(int[] arr) {
        int i=arr.length-1,j=i;
        while(i>=0) {
            if(arr[i]!=0) 
		arr[j--]=arr[i];
            i--;
        }
        while(j>=0) 
		arr[j--]=0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++) 
            arr[i]=sc.nextInt();
        moveZeros(arr);
        System.out.println("After moving zeros: " + Arrays.toString(arr));
    }
}
