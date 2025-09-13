import java.util.Scanner;

public class Q5 {
    static int findRepeatedeven(int[] arr) {
        int rep=0;
        for(int i=0;i<arr.length;i++)
            rep=rep^arr[i];
        return rep;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: (even)");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int rep=findRepeatedeven(arr);
        if(rep==0)
            System.err.println("There is no repeated element in the array");
        else    
            System.out.println("The repeated element in the array is "+rep);
    }
}
